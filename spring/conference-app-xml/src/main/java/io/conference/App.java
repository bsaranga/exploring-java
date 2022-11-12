package io.conference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.conference.service.ISpeakerService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        var service = applicationContext.getBean("speakerService", ISpeakerService.class);
        var service2 = applicationContext.getBean("speakerService2", ISpeakerService.class);

        var firstName = service.findAll().get(0).getFirstName();
        var lastName = service2.findAll().get(0).getLastName();
        System.out.println(firstName);
        System.out.println(lastName);
    }
}
