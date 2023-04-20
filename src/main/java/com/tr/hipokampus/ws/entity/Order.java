package com.tr.hipokampus.ws.entity;

import com.tr.hipokampus.ws.entity.Package.PackageDetail;
import com.tr.hipokampus.ws.request.PackageOrderRequest;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private long id;

    private String orderCode;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Embedded
    private PackageOrderRequest packageOrderRequest;

    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;

    private String orderNote;

    private double price;

    private final long datetime = new Date().getTime();
}
