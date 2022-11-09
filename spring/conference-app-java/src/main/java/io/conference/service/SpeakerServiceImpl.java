package io.conference.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import io.conference.model.Speaker;
import io.conference.repository.ISpeakerRepository;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements ISpeakerService {
    
    private ISpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpearkerServiceImp no args constructor");
    }

    @Autowired
    public SpeakerServiceImpl(ISpeakerRepository speakerRepository) {
        repository = speakerRepository;
        System.out.println("SpearkerServiceImp repository constructor");
    }

    public void setRepository(ISpeakerRepository repository) {
        this.repository = repository;
        System.out.println("SpearkerServiceImp setter");
    }

    public List<Speaker> findAll() {
        return repository.findAll();    
    }
}
