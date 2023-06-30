package com.tr.hipokampus.ws.controller;

import com.tr.hipokampus.ws.entity.Order;
import com.tr.hipokampus.ws.service.CateringService;
import com.tr.hipokampus.ws.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/catering")
public class CateringController {
    @Autowired
    CateringService cateringService;
/*

    @PostMapping
    public Catering addDish(@RequestBody Catering catering) {
        return orderService.addOrder(order);
    }
*/
}
