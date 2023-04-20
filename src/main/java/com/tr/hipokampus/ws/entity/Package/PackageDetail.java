package com.tr.hipokampus.ws.entity.Package;

import com.tr.hipokampus.ws.Enum.PackageType;
import com.tr.hipokampus.ws.Enum.Services;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "packages")
public class PackageDetail {
    @Id
    @GeneratedValue
    long id;
    String name;
    String description;
    @Enumerated(EnumType.STRING)
    private Services service;
    @Enumerated(EnumType.STRING)
    private PackageType packageType;

    @OneToMany(mappedBy = "packageDetail", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<PackagePrice> priceList;

}
