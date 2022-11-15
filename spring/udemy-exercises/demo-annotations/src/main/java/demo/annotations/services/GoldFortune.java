package demo.annotations.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GoldFortune implements IFortuneService {

    // Value injection from file using annotations
    @Value("${app.connectionString}")
    private String connectionString;

    @Override
    public String getFortune() {
        System.out.println(String.format("Got connection string: %s", connectionString));
        return "You found a 100g pot of gold.";
    }
    
}
