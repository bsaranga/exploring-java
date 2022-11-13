package demo.dependencyinjection.classes;

import demo.dependencyinjection.interfaces.ICoach;
import demo.dependencyinjection.services.IFortuneService;

public class JiuJitsuCoach implements ICoach {

    private IFortuneService fortuneService;

    public JiuJitsuCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyRoutine() {
        return "Train grappling for 40 minutes";
    }

    @Override
    public String getDailyFortune() {
        return this.fortuneService.getFortune();
    }
    
}
