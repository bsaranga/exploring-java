package demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.annotations.model.Coach.ICoach;

public class App 
{
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var tennisCoach = context.getBean("thatSillyCoach", ICoach.class);
        
        System.out.println(tennisCoach.getDailyWorkout());
        context.close();
    }
}
