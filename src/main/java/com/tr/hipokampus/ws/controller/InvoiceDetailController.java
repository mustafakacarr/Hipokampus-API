package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.entity.InvoiceDetail;
import com.tr.hipokampus.ws.service.InvoiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1.0/invoiceDetails")
public class InvoiceDetailController {
    @Autowired
    InvoiceDetailService invoiceDetailService;
    @GetMapping("/{userId}")
    public List<InvoiceDetail> getInvoiceDetails(@PathVariable long userId){
        return invoiceDetailService.getInvoiceDetails(userId);
    }
    @PostMapping
    public InvoiceDetail addInvoiceDetail(@RequestBody InvoiceDetail invoiceDetail){
        return invoiceDetailService.addInvoiceDetail(invoiceDetail);
    }
}
