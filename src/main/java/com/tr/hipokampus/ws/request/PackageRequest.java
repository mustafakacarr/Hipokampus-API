package com.tr.hipokampus.ws.request;

import com.tr.hipokampus.ws.entity.Package.PackageDetail;
import com.tr.hipokampus.ws.entity.Package.PackagePrice;
import lombok.Data;

import java.util.List;

@Data
public class PackageRequest {

    private PackageDetail packageDetail;
    private List<PackagePrice> packagePrices;

}

