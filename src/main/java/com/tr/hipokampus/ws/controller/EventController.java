package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.entity.Event;
import com.tr.hipokampus.ws.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/events")
public class EventController {
@Autowired
    EventService eventService;

    @PostMapping
    public ResponseEntity<String> addEvent(@RequestBody Event event){
        eventService.addEvent(event);
        return ResponseEntity.ok("Event added");
    }

}
