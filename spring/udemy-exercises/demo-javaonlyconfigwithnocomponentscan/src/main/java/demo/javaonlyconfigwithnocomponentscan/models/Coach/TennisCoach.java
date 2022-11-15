package demo.javaonlyconfigwithnocomponentscan.models.Coach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import demo.javaonlyconfigwithnocomponentscan.services.fortuneService.IFortuneService;

@Component
public class TennisCoach implements ICoach {

    @Autowired
    @Qualifier("randomService")
    private IFortuneService fortuneService;

    @Override
    public String getRoutine() {
        return "Play tennis for 60 minutes";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortuneService();
    }
    
}
