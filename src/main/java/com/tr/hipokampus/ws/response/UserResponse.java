package com.tr.hipokampus.ws.response;

import com.tr.hipokampus.ws.annotation.UniqueUsername;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class UserResponse {
    private long id;
    private String name;
    private String username;
    private String email;
    private String phone;
}
