package com.tr.hipokampus.ws.service;

import com.tr.hipokampus.ws.entity.Order;
import com.tr.hipokampus.ws.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackageOrderService {
    @Autowired
    OrderRepository orderRepository;
    public Order addOrder(Order order) {
       return orderRepository.save(order);
    }
}
