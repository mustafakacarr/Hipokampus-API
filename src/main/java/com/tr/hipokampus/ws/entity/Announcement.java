package com.tr.hipokampus.ws.entity;

import com.tr.hipokampus.ws.Enum.Services;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "announcements")
public class Announcement {
    @Id
    @GeneratedValue
    long id;

    String label;
    String description;

    @Enumerated(EnumType.STRING)
    Services service;
}
