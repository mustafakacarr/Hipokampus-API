package com.tr.hipokampus.ws.entity.Package;

import com.tr.hipokampus.ws.Enum.PackageType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name="package-periods")
public class PackagePeriod {
    @jakarta.persistence.Id
    @GeneratedValue()
    private long Id;

    @NotBlank
    private String name;
@NotNull
    @Enumerated(EnumType.STRING)
    private PackageType packageType;


}
