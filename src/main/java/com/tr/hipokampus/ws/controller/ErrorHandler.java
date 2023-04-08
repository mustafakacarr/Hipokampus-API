package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.common.ApiError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ErrorHandler implements ErrorController {
    @Autowired
    ErrorAttributes errorAttributes;

    @RequestMapping("/error")
    public ApiError errorHandler(WebRequest request) {
        Map<String, Object> attributes = errorAttributes
                .getErrorAttributes(request, ErrorAttributeOptions.of(ErrorAttributeOptions.Include.BINDING_ERRORS,
                        ErrorAttributeOptions.Include.MESSAGE));
        String message = (String) attributes.get("message");
        int status = (int) attributes.get("status");
        String path = (String) attributes.get("path");
        ApiError apiError=new ApiError(status,message,path);
        if(attributes.containsKey("errors")){
           List<FieldError> errorList= (List<FieldError>) attributes.get("errors");
            HashMap<String, String> errorMap = new HashMap<>();
            for (FieldError field : errorList) {
                errorMap.put(field.getField(), field.getDefaultMessage());
            }
          apiError.setValidationErrors(errorMap);
        }
        return apiError;
    }
}
