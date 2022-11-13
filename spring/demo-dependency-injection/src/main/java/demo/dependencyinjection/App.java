package demo.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.dependencyinjection.interfaces.ICoach;

public class App 
{
    public static void main( String[] args )
    {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        var MmaCoach = context.getBean("mma", ICoach.class);

        System.out.println(MmaCoach.getDailyRoutine());
        context.close();
    }
}
