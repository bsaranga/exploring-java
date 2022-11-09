package io.conference;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import io.conference.repository.HibernateSpeakerRepositoryImpl;
import io.conference.repository.ISpeakerRepository;
import io.conference.service.ISpeakerService;
import io.conference.service.SpeakerServiceImpl;

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
}
