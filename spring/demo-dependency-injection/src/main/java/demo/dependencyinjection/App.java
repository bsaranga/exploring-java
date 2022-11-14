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
        
        // Scope demo (Prototype)
        var jiujistuCoachA = context.getBean("jiujitsu", ICoach.class);
        var jiujistuCoachB = context.getBean("jiujitsu", ICoach.class);

        System.out.println(jiujistuCoachA.hashCode());
        System.out.println(jiujistuCoachB.hashCode()); //The hashCode of this object is different from the above object. This means a new object was made.
        
        System.out.println("");
        // Scope demo (Singleton)
        var karateCoachA = context.getBean("karate", ICoach.class);
        var karateCoachB = context.getBean("karate", ICoach.class);

        System.out.println(karateCoachA.hashCode());
        System.out.println(karateCoachB.hashCode()); // The hashCode is the same, which means it's the same object that the spring context gives. Hence singleton lifetime.
        context.close();
    }
}
