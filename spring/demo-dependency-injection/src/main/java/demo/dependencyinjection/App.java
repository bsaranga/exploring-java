package demo.dependencyinjection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.dependencyinjection.implementations.CricketCoach;
import demo.dependencyinjection.interfaces.ICoach;

public class App 
{
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var mmaCoach = context.getBean("mma", ICoach.class);
        var crickCoach = (CricketCoach) context.getBean("cricket", ICoach.class);

        System.out.println(mmaCoach.getDailyRoutine());
        System.out.println("");
        System.out.println(String.format("Mma coach: %s", mmaCoach.getDailyFortune()));
        System.out.println(String.format("Cricket coach: %s", crickCoach.getDailyFortune()));
        System.out.println("");
        System.out.println(String.format("Cricket coach's team: %s, and email addr: %s", crickCoach.getTeam(), crickCoach.getEmailAddress()));
        context.close();
    }
}
