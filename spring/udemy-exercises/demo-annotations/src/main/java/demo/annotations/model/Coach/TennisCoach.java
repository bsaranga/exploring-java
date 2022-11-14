package demo.annotations.model.Coach;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements ICoach {

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley.";
    }
    
}
