package com.tr.hipokampus.ws.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueUsernameValidator.class)
public @interface UniqueUsername {
    String message() default "Username cannot be duplicated!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
