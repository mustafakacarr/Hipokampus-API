package com.tr.hipokampus.ws.repository;

import com.tr.hipokampus.ws.entity.PackageOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageOrderRepository extends JpaRepository<PackageOrder,Long> {
}
