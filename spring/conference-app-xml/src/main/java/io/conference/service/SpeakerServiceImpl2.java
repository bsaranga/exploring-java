package io.conference.service;

import java.util.List;

import io.conference.model.Speaker;
import io.conference.repository.ISpeakerRepository;

public class SpeakerServiceImpl2 implements ISpeakerService {
    
    private ISpeakerRepository repository;

    public void setSpeakerRepository(ISpeakerRepository repository) {
        System.out.println("In the second speaker service implementation...");
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();    
    }
}
