package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.InvoiceDetail;
import com.tr.hipokampus.ws.repository.InvoiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceDetailService {
@Autowired
InvoiceDetailRepository invoiceDetailRepository;

    public List<InvoiceDetail> getInvoiceDetails(long userId) {
        return invoiceDetailRepository.findByUserId(userId);
    }

    public InvoiceDetail addInvoiceDetail(InvoiceDetail invoiceDetail) {
        return invoiceDetailRepository.save(invoiceDetail);
    }
}
