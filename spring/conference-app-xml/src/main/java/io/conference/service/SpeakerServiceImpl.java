package io.conference.service;

import java.util.List;

import io.conference.model.Speaker;
import io.conference.repository.HibernateSpeakerRepositoryImpl;
import io.conference.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return repository.findAll();    
    }
}
