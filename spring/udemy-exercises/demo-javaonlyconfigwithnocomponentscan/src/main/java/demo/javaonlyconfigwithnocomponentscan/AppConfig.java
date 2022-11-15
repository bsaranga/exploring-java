package demo.javaonlyconfigwithnocomponentscan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import demo.javaonlyconfigwithnocomponentscan.models.Coach.ICoach;
import demo.javaonlyconfigwithnocomponentscan.models.Coach.TennisCoach;
import demo.javaonlyconfigwithnocomponentscan.services.fortuneService.FortuneService;
import demo.javaonlyconfigwithnocomponentscan.services.fortuneService.IFortuneService;

@Configuration
public class AppConfig {
    
    @Bean
    public IFortuneService fortuneService() {
        return new FortuneService();
    }

    @Bean
    @Scope("prototype")
    public ICoach tennisCoach() {
        return new TennisCoach(fortuneService());
    }
}
