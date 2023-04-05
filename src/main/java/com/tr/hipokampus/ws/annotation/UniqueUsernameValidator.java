package com.tr.hipokampus.ws.annotation;

import com.tr.hipokampus.ws.repository.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.Annotation;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername,String> {
    @Autowired
    UserRepository userRepository;
    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return !userRepository.existsByUsername(username);
    }
}
