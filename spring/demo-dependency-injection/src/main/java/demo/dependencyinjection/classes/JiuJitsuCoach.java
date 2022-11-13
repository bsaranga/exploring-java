package demo.dependencyinjection.classes;

import demo.dependencyinjection.interfaces.ICoach;

public class JiuJitsuCoach implements ICoach {

    @Override
    public String getDailyRoutine() {
        return "Train grappling for 40 minutes";
    }
    
}
