package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.Package.PackagePeriod;
import com.tr.hipokampus.ws.repository.Package.PackagePeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackagePeriodService {
    @Autowired
    PackagePeriodRepository packagePeriodRepository;
    public PackagePeriod addPeriod(PackagePeriod packagePeriod) {
        return packagePeriodRepository.save(packagePeriod);
    }
}
