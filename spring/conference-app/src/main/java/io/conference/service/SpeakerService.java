package io.conference.service;

import java.util.List;

import io.conference.model.Speaker;

public interface SpeakerService {
    List<Speaker> findAll();
}
