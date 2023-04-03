package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.UserEntity;

import com.tr.hipokampus.ws.repository.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@Data
public class UserService {
   @Autowired
    UserRepository userRepository;
    PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();

    public void createUser(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

    }
}
