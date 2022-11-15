package demo.javaonlyconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import demo.javaonlyconfig.models.Coach.ICoach;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ICoach tennisCoach = context.getBean("tennisCoach", ICoach.class);
        
        System.out.println(tennisCoach.getRoutine());
        System.out.println(tennisCoach.getFortune());
        context.close();
    }
}
