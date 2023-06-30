package com.tr.hipokampus.ws.repository;

import com.tr.hipokampus.ws.entity.EventOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventOrderRepository extends JpaRepository<EventOrder,Long> {
}
