package com.tr.hipokampus.ws.entity.Package;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tr.hipokampus.ws.Enum.PackageType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name="packages")
public class PackageDetail {

    @Id
    @GeneratedValue()
    private long Id;

    @NotBlank
    private String label;

    private String description;
    @NotNull
    private int service;
    @Enumerated(EnumType.STRING)
    private PackageType packageType;

    @JsonIgnore
    @OneToMany(mappedBy = "packageDetail", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PackagePrice> priceList;

}
