package com.tr.hipokampus.ws.entity;

import com.tr.hipokampus.ws.entity.Package.PackageDetail;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("package_order")
public class PackageOrder extends Order{

    @OneToOne
    @JoinColumn(name = "order_package_id")
    private PackageDetail orderPackage;
}
