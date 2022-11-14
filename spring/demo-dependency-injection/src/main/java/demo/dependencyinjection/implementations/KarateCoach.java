package demo.dependencyinjection.implementations;

import demo.dependencyinjection.interfaces.ICoach;

public class KarateCoach implements ICoach {

    @Override
    public String getDailyRoutine() {
        return "Do Karate 24x7";
    }

    @Override
    public String getDailyFortune() {
        return "10 Mana Points";
    }
    
}
