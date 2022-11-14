package demo.dependencyinjection.implementations;

import demo.dependencyinjection.interfaces.ICoach;
import demo.dependencyinjection.services.IFortuneService;

public class CricketCoach implements ICoach {

    private IFortuneService fortuneService;

    // Email Address Property
    private String emailAddress;
    
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println(String.format("Injected email: %s", emailAddress));
        this.emailAddress = emailAddress;
    }
    //--------------------

    // Team Property
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println(String.format("Injected team: %s", team));
        this.team = team;
    }
    //--------------------

    // Constructor
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
