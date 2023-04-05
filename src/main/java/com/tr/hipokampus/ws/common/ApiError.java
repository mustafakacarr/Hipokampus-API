package com.tr.hipokampus.ws.common;

import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class ApiError {

    private int status;
    private String message;
    private String errorPath;
    private long timestamp= new Date().getTime();
    private Map validationErrors;

    public ApiError(int status, String message, String errorPath) {
        this.status = status;
        this.message = message;
        this.errorPath = errorPath;
    }
}
