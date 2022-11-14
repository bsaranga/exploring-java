package io.conference.service;

import java.util.List;

import io.conference.model.Speaker;

public interface ISpeakerService {
    List<Speaker> findAll();
}
