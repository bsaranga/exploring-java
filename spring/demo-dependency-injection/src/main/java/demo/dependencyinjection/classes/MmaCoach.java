package demo.dependencyinjection.classes;

import demo.dependencyinjection.interfaces.ICoach;
import demo.dependencyinjection.services.IFortuneService;

public class MmaCoach implements ICoach {

    private IFortuneService fortuneService;

    public MmaCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getDailyRoutine() {
        return "Core workouts 45 mins [extended]";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
    
}
