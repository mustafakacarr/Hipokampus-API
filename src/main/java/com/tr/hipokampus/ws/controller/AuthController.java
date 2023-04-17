package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.auth.HKUserDetails;
import com.tr.hipokampus.ws.entity.User;
import com.tr.hipokampus.ws.response.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/api/v1.0/auth")
    public ResponseEntity handleAuthentication(){
        HKUserDetails userdetails= (HKUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user=userdetails.getUser();
        UserResponse userResponse=new UserResponse(user.getName(),user.getUsername(),user.getEmail(),user.getPhone());
        return ResponseEntity.ok().body(userResponse);
    }

}
