package com.tr.hipokampus.ws.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="payment")
public class Payment {
    @Id
    @GeneratedValue
    private long id;
    int payStatus;
    String failedResponse;

}
