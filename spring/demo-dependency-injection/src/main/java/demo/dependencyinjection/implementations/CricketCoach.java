package demo.dependencyinjection.implementations;

import demo.dependencyinjection.interfaces.ICoach;
import demo.dependencyinjection.services.IFortuneService;

public class CricketCoach implements ICoach {

    private IFortuneService fortuneService;

    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyRoutine() {
        return "Daily match practice 50 mins";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
    
}
