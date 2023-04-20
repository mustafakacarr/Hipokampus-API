package com.tr.hipokampus.ws.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tr.hipokampus.ws.annotation.UniqueUsername;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue()
    private long Id;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @Size(min = 4,max = 15)
    @UniqueUsername
    private String username;
    @NotNull
    @NotBlank
    private String password;
@Pattern(regexp = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;
    private String phone;

    @JsonIgnore
    @OneToMany(mappedBy = "user")

    private List<InvoiceDetail> invoiceDetails;

}
