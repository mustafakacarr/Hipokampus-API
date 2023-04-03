package com.tr.hipokampus.ws.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue()
    private long Id;
    private String name;
    private String username;
    private String password;
    private String email;
    private String phone;

}
