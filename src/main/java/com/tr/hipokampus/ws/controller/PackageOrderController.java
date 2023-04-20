package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.entity.Order;
import com.tr.hipokampus.ws.service.PackageOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/packageOrders")
public class PackageOrderController {
    @Autowired
    PackageOrderService packageOrderService;

    @PostMapping
    public Order addOrder(@RequestBody Order order) {
    return packageOrderService.addOrder(order);
    }


}
