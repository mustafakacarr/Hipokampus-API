package com.tr.hipokampus.ws.entity.Package;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="package-prices")
public class PackagePrice {
    @Id
    @GeneratedValue()
    private long Id;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="period_id", nullable=false)
    private PackagePeriod period;
    @NotNull
    private int price;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="packages_id", nullable=false)
    private PackageDetail packageDetail;
}
