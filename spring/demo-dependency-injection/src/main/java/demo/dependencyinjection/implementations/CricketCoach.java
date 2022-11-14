package demo.dependencyinjection.implementations;

import demo.dependencyinjection.interfaces.ICoach;
import demo.dependencyinjection.services.IFortuneService;

public class CricketCoach implements ICoach {

    private IFortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Constructing Cricket Coach in the no-args constructor");
    }

    public void setFortuneService(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("The fortune service dependency was injected via the setter.");
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
