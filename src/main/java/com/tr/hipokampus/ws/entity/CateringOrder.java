package com.tr.hipokampus.ws.entity;

import com.tr.hipokampus.ws.Enum.Services;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("catering_order")
public class CateringOrder extends Order{
}
