package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.User;

import com.tr.hipokampus.ws.repository.UserRepository;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Data
public class UserService {

    UserRepository userRepository;

    PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

    }

    public User updateUser(long userId, User newUser){
       Optional<User> user= userRepository.findById(userId);
       if(user.isPresent()){
           User foundUser = user.get();
           foundUser.setName(newUser.getName());
           foundUser.setUsername(newUser.getUsername());
           foundUser.setPhone(newUser.getPhone());
           foundUser.setEmail(newUser.getPhone());
           return userRepository.save(foundUser);
       }else {
           return null;
       }
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
