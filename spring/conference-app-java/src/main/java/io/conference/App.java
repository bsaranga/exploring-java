package io.conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.conference.service.ISpeakerService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println(applicationContext.getApplicationName());

        ISpeakerService service = applicationContext.getBean(ISpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
        
        ISpeakerService service2 = applicationContext.getBean(ISpeakerService.class);

        System.out.println(service);
        System.out.println(service2);
    }
}
