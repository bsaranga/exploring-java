package demo.javaonlyconfig.services.fortuneService;

import org.springframework.stereotype.Component;

@Component
public class FortuneService implements IFortuneService {

    @Override
    public String getFortuneService() {
        return "Today is your lucky day...";
    }
    
}
