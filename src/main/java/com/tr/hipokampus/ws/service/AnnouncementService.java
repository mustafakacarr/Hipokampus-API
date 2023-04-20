package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.Announcement;
import com.tr.hipokampus.ws.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {
@Autowired
AnnouncementRepository announcementRepository;

    public Announcement addAnnouncement(Announcement announcement) {
        announcementRepository.save(announcement);
        return announcement;
    }


    public List<Announcement> getAnnouncements() {
       return announcementRepository.findAll();
    }
}
