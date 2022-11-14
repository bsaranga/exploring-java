package demo.annotations;

import demo.annotations.model.Coach.ICoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var tennisCoach = context.getBean("tennisCoach", ICoach.class);

        System.out.println("...Tennis Coach...");
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());
        System.out.println("");

        System.out.println("...Cricket Coach...");
        var cricketCoach = context.getBean("cricketCoach", ICoach.class);
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println("");

        System.out.println("...KungFu Coach...");
        var kungfuCoach = context.getBean("kungFuCoach", ICoach.class);
        System.out.println(kungfuCoach.getDailyFortune());
        System.out.println("");
        
        System.out.println("...MMA Coach...");
        var mmaCoach = context.getBean("mmaCoach", ICoach.class);
        System.out.println(mmaCoach.getDailyFortune());
        System.out.println("");
        context.close();
    }
}
