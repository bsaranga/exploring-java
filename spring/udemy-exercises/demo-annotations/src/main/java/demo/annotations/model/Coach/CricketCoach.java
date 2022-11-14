package demo.annotations.model.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.annotations.services.IFortuneService;

@Component
public class CricketCoach implements ICoach {

    private IFortuneService fortuneService;
    
    @Autowired
    public void setFortuneService(IFortuneService fortuneService) {
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
    
}
