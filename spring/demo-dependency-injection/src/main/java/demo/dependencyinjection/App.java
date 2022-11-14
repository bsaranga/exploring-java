package demo.dependencyinjection;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import demo.dependencyinjection.interfaces.ICoach;

public class App 
{
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var mmaCoach = context.getBean("mma", ICoach.class);
        var crickCoach = context.getBean("cricket", ICoach.class);

        System.out.println(mmaCoach.getDailyRoutine());
        System.out.println(String.format("Mma coach: %s", mmaCoach.getDailyFortune()));
        System.out.println(String.format("Cricket coach: %s", crickCoach.getDailyFortune()));
        context.close();
    }
}
