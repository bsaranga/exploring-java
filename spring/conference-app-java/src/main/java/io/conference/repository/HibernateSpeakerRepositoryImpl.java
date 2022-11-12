package io.conference.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import io.conference.model.Speaker;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements ISpeakerRepository {
    
    @Autowired
    private Calendar calendar;

    @Value("#{ T(java.lang.Math).random() * 100}")
    private double seedNum;

    public List<Speaker> findAll() {
        System.out.println("calendar:" + calendar.getTime());
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Buwaneka");
        speaker.setLastName("Saranga");
        speaker.setSeedNum(seedNum);

        speakers.add(speaker);
        return speakers;
    }
}
