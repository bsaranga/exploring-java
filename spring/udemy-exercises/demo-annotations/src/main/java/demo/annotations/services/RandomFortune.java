package demo.annotations.services;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements IFortuneService {

    private Random rand = new Random();
    private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck", "The journey is the reward" };

    @Override
    public String getFortune() {
        return data[rand.nextInt(data.length)];
    }
    
}
