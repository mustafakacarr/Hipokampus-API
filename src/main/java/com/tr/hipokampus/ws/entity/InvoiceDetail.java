package com.tr.hipokampus.ws.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "invoice-details")
public class InvoiceDetail {
    @Id
    @GeneratedValue
    long id;
String invoiceName;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    String phone;

    String email;

    String address;

}
