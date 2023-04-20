package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.common.GenericResponse;
import com.tr.hipokampus.ws.entity.User;
import com.tr.hipokampus.ws.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/users/")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public GenericResponse createUser(@Valid @RequestBody User user) {
        userService.createUser(user);
        return new GenericResponse("user succesfully created!");
    }

    @PutMapping("/{userId}")
    public GenericResponse updateUser(@PathVariable long userId,@Valid @RequestBody User newUser){
       userService.updateUser(userId,newUser);
        return new GenericResponse("user succesfully updated!");
    }

@GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
}
}
