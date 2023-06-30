package com.tr.hipokampus.ws.repository;

import com.tr.hipokampus.ws.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
