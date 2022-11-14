package io.conference.repository;

import java.util.List;
import io.conference.model.Speaker;

public interface ISpeakerRepository {
    List<Speaker> findAll();
}
