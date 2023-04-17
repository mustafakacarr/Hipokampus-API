package com.tr.hipokampus.ws.repository.Package;

import com.tr.hipokampus.ws.entity.Package.PackagePrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackagePriceRepository extends JpaRepository<PackagePrice,Long> {
}
