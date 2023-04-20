package com.tr.hipokampus.ws.request;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;


@Data
@Embeddable
public class PackageOrderRequest {
    private String packageName;
    private String packageDescription;
    private String packagePeriod;
}
