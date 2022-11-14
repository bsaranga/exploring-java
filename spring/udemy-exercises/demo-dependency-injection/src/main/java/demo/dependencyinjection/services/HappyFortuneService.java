package demo.dependencyinjection.services;

public class HappyFortuneService implements IFortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
    
}
