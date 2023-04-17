package com.tr.hipokampus.ws.repository.Package;

import com.tr.hipokampus.ws.entity.Package.PackagePeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackagePeriodRepository extends JpaRepository<PackagePeriod,Long> {
}
