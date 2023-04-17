package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.common.GenericResponse;
import com.tr.hipokampus.ws.entity.Package.PackagePeriod;
import com.tr.hipokampus.ws.request.PackageRequest;
import com.tr.hipokampus.ws.response.PackageResponse;
import com.tr.hipokampus.ws.service.PackagePeriodService;
import com.tr.hipokampus.ws.service.PackageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/api/v1.0/packagePeriods")
    public class PackagePeriodController {
        @Autowired
        PackagePeriodService packagePeriodService;

        @PostMapping
        public PackagePeriod addPeriod(@Valid @RequestBody PackagePeriod packagePeriod) {
            return packagePeriodService.addPeriod(packagePeriod);

        }
    }

