package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.common.ApiError;
import com.tr.hipokampus.ws.common.GenericResponse;
import com.tr.hipokampus.ws.entity.UserEntity;
import com.tr.hipokampus.ws.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1.0/users/")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public GenericResponse createUser(@Valid @RequestBody UserEntity user) {
        userService.createUser(user);
        return new GenericResponse("user succesfully created!");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleValidationErrors(MethodArgumentNotValidException exception) {
        ApiError error = new ApiError(400, "Validation Error", "/api/v1.0/users/");
        HashMap<String, String> errorMap = new HashMap<>();
        for (FieldError field : exception.getBindingResult().getFieldErrors()) {
            errorMap.put(field.getField(), field.getDefaultMessage());
        }
        error.setValidationErrors(errorMap);
        return error;
    }


}
