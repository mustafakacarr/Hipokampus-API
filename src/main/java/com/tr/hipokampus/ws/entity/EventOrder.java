package com.tr.hipokampus.ws.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("event_order")
public class EventOrder extends Order{
    @OneToOne
    @JoinColumn(name = "event_id")
    private Event event;
}



