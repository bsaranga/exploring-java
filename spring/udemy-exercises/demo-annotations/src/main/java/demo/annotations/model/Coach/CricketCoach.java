package demo.annotations.model.Coach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import demo.annotations.services.IFortuneService;

@Component
public class CricketCoach implements ICoach {

    private IFortuneService fortuneService;
    
    @Autowired
    public void setFortuneService(@Qualifier("goldFortune") IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Get 45 minutes of runs and ballings.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @PostConstruct
    public void PostConstructMethod() {
        System.out.println("\n<<<Cricket coach has been constructed>>>\n");
    }

    @PreDestroy
    public void PreDestroyMethod() {
        System.out.println("\n<<<Cricket coach has been destroyed>>>\n");
    }
    
}
