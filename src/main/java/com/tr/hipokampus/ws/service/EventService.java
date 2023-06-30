package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.Event;
import com.tr.hipokampus.ws.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
@Autowired
EventRepository eventRepository;

    public void addEvent(Event event) {
        eventRepository.save(event);
    }
}
