package com.tr.hipokampus.ws.repository.Package;

import com.tr.hipokampus.ws.entity.Package.PackageDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageDetailRepository extends JpaRepository<PackageDetail,Long> {
}
