package io.conference.service;

import java.util.List;

import io.conference.model.Speaker;
import io.conference.repository.ISpeakerRepository;

public class SpeakerServiceImpl implements ISpeakerService {
    
    private ISpeakerRepository repository;

    public void setSpeakerRepository(ISpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();    
    }
}
