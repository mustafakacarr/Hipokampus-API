package com.tr.hipokampus.ws.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InvoiceDetailResponse {
    private long id;
    private String name;
    private String phone;
    private String email;
    private String address;
}
