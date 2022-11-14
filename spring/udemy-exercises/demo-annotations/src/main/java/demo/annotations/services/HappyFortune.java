package demo.annotations.services;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements IFortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
    
}
