package demo.javaonlyconfigwithnocomponentscan.models.Coach;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

import demo.javaonlyconfigwithnocomponentscan.services.fortuneService.IFortuneService;

public class TennisCoach implements ICoach {

    @Value("${default.email}")
    private String email;
    @Value("${default.teamName}")
    private String team;

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

    @PostConstruct
    public void ShowInfo() {
        System.out.println(String.format("Coach has email: %s, and the team name is: %s", this.email, this.team));
    }
    
}
