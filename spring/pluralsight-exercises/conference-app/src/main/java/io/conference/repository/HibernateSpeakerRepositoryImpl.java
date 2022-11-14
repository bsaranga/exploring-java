package io.conference.repository;

import java.util.ArrayList;
import java.util.List;

import io.conference.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Buwaneka");
        speaker.setLastName("Saranga");

        speakers.add(speaker);
        return speakers;
    }
}
