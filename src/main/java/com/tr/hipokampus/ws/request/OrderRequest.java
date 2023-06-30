package com.tr.hipokampus.ws.request;

import com.tr.hipokampus.ws.entity.Order;
import com.tr.hipokampus.ws.entity.Payment;
import com.tr.hipokampus.ws.entity.User;
import lombok.Data;

import java.util.HashMap;
import java.util.Objects;

import com.tr.hipokampus.ws.entity.User;

@Data
public abstract class OrderRequest {

    private User user;
    private String orderCode;

    private HashMap<String, Float> priceDetails;

    private float totalPrice;
    private String orderNote;
    private Payment payment;
    private Object orderContent;

    abstract void createOrderCode();



}


