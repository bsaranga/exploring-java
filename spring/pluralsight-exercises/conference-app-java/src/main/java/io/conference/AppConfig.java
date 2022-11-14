package io.conference;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;

/*
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import io.conference.repository.HibernateSpeakerRepositoryImpl;
import io.conference.repository.ISpeakerRepository;
import io.conference.service.ISpeakerService;
import io.conference.service.SpeakerServiceImpl;
*/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.conference.util.CalendarFactory;

@Configuration
@ComponentScan({"io.conference"})
public class AppConfig {

    // @Bean(name = "speakerService")
    // @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    // public ISpeakerService getSpeakerService() {
    //     SpeakerServiceImpl service = new SpeakerServiceImpl();
    //     //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
    //     // service.setRepository(getSpeakerRepository());
    //     return service;
    // }

    // @Bean(name = "speakerRepository")
    // public ISpeakerRepository getSpeakerRepository() {
    //     return new HibernateSpeakerRepositoryImpl();
    // }

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }
}
