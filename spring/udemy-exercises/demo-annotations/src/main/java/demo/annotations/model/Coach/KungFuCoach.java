package demo.annotations.model.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.annotations.services.IFortuneService;

@Component
public class KungFuCoach implements ICoach {

    private IFortuneService fortuneService;

    @Autowired // Example of method injection
    public void setupDependencies(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do 45 minutes of Monkey Style";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
