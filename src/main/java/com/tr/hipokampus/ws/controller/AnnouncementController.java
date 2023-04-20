package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.entity.Announcement;
import com.tr.hipokampus.ws.service.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/announcements")
public class AnnouncementController {

    @Autowired
    AnnouncementService announcementService;
    @PostMapping
    public Announcement addAnnouncement(@RequestBody Announcement announcement){
        return announcementService.addAnnouncement(announcement);
    }

    @GetMapping
    public List<Announcement> getAnnouncements(){
        return announcementService.getAnnouncements();
    }

}
