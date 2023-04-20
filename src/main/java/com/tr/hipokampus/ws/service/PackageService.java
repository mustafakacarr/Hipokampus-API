package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.Package.PackageDetail;
import com.tr.hipokampus.ws.entity.Package.PackagePrice;
import com.tr.hipokampus.ws.repository.Package.PackageDetailRepository;
import com.tr.hipokampus.ws.repository.Package.PackagePriceRepository;
import com.tr.hipokampus.ws.request.PackageRequest;
import com.tr.hipokampus.ws.response.PackageResponse;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PackageService {

    @Autowired
    private PackagePriceRepository packagePriceRepository;


    @Autowired
    private PackageDetailRepository packageDetailRepository;

    @Transactional
    public PackageResponse addPackage(PackageRequest packageRequest) {
        List<PackagePrice> priceList = packageRequest.getPackagePrices();
        PackageDetail packageDetail = packageRequest.getPackageDetail();
        packageDetailRepository.save(packageDetail);
        for (PackagePrice packagePrice : priceList) {
            packagePrice.setPackageDetail(packageDetail);
            packagePriceRepository.save(packagePrice);
        }
        PackageResponse packageResponse = new PackageResponse(packageDetail, priceList);
        return packageResponse;
    }

    @Transactional
    public boolean deletePackage(long packageId) {
        PackageDetail packageDetail = packageDetailRepository.findById(packageId)
                .orElseThrow(() -> new EntityNotFoundException("PackageDetail not found with id " + packageId));

        packageDetailRepository.delete(packageDetail);
        return true;
    }

    public PackageDetail getPackage(long packageId) {
        Optional<PackageDetail> packageDetail=packageDetailRepository.findById(packageId);
        if(packageDetail.isPresent()){
            return packageDetail.get();
        }else {
            return null;
        }
    }

    public List<PackageDetail> getAllPackage() {
    return packageDetailRepository.findAll();
    }
}
