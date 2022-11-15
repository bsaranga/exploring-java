package demo.javaonlyconfigwithnocomponentscan.models.Coach;

import demo.javaonlyconfigwithnocomponentscan.services.fortuneService.IFortuneService;

public class TennisCoach implements ICoach {

    private IFortuneService fortuneService;

    public TennisCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    
    @Override
    public String getRoutine() {
        return "Play tennis for 60 minutes";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortuneService();
    }
    
}
