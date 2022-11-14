package demo.annotations.model.Coach;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import demo.annotations.services.IFortuneService;

@Component
public class TennisCoach implements ICoach {

    private IFortuneService fortuneService;

    @Autowired // Autowired annotation is optional since Spring 4.3
    public TennisCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
