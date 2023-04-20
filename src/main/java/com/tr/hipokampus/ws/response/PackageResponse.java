package com.tr.hipokampus.ws.response;

import com.tr.hipokampus.ws.entity.Package.PackageDetail;
import com.tr.hipokampus.ws.entity.Package.PackagePrice;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.postgresql.shaded.com.ongres.scram.common.bouncycastle.pbkdf2.Pack;

import java.util.List;

@Data
@AllArgsConstructor
public class PackageResponse {
    private PackageDetail packageDetail;
    private List<PackagePrice> packagePrices;

}

