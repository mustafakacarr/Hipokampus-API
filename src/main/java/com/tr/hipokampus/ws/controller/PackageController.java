package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.entity.Package.PackageDetail;
import com.tr.hipokampus.ws.request.PackageRequest;
import com.tr.hipokampus.ws.response.PackageResponse;
import com.tr.hipokampus.ws.service.PackageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/packages")
public class PackageController {
    @Autowired
    PackageService packageService;

    @PostMapping
    public PackageResponse addPackage(@Valid @RequestBody PackageRequest packageDetail) {
        return packageService.addPackage(packageDetail);
    }
    @GetMapping
    public List<PackageDetail> getAllPackage() {
        return packageService.getAllPackage();
    }
    @DeleteMapping( "/{packageId}")
    public boolean deletePackage(@PathVariable long packageId) {
        return packageService.deletePackage(packageId);
    }
    @GetMapping( "/{packageId}")
    public PackageDetail getPackage(@PathVariable long packageId) {
        return packageService.getPackage(packageId);
    }
}
