package com.tr.hipokampus.ws.repository;

import com.tr.hipokampus.ws.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
    boolean existsByUsername(String username);
}
