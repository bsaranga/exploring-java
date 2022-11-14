package demo.annotations;

import demo.annotations.model.Coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var tennisCoach = context.getBean("tennisCoach", ICoach.class);

        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        context.close();
    }
}
