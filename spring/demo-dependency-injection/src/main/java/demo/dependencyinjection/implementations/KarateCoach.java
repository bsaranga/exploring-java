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

    // configured in the applicationContext.xml
    public void startupMethod() {
        System.out.println(this.toString() + ": " + "Startup method was called ...");
    }
    
    // configured in the applicationContext.xml
    public void destroyMethod() {
        System.out.println(this.toString() + ": " + "Destroy method was called...");
    }
}
