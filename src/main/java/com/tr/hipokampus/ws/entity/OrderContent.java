package com.tr.hipokampus.ws.entity;

import com.tr.hipokampus.ws.Enum.Services;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "order_contents")
public class OrderContent {

    @GeneratedValue
    @Id
    private long id;
    private String productName;
    private String productDescription;
    @Enumerated(EnumType.STRING)
    private Services service;
    private float price;
}