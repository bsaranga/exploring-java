package demo.javaonlyconfig.services.fortuneService;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements IFortuneService{

    private String[] fortunes = {"See further by standing on the shoulders of giants", "One man's trash is another man's treasure", "I think therefore I am"};
    private Random rand = new Random();

    @Override
    public String getFortuneService() {
        return fortunes[rand.nextInt(fortunes.length)];
    }
    
}
