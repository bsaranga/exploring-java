package demo.dependencyinjection.classes;

import demo.dependencyinjection.interfaces.ICoach;

public class MmaCoach implements ICoach {

    @Override
    public String getDailyRoutine() {
        return "Core workouts 45 mins [extended]";
    }
    
}
