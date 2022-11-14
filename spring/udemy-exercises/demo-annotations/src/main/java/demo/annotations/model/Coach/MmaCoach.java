package demo.annotations.model.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.annotations.services.IFortuneService;

@Component
public class MmaCoach implements ICoach {

    @Autowired // example of field injection
    private IFortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "45 minutes cardio";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
