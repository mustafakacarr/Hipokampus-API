package com.tr.hipokampus.ws.UserController;

import com.tr.hipokampus.ws.common.GenericResponse;
import com.tr.hipokampus.ws.entity.UserEntity;
import com.tr.hipokampus.ws.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/users/")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public GenericResponse createUser(@RequestBody UserEntity user){
        userService.createUser(user);
        return new GenericResponse("user succesfully created!");
    }


}
