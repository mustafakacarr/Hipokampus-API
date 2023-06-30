package com.tr.hipokampus.ws.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue
    long id;
    String name;
    String description;

    private String shortDescription;
    private short quota;
    private long eventDateTime;
}
