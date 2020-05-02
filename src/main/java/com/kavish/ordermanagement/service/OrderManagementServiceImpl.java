package com.kavish.ordermanagement.service;

import org.springframework.stereotype.Component;

@Component
public class OrderManagementServiceImpl implements OrderManagementService {
    @Override
    public String getOrderDetails() {
        return "Hello World";
    }
}
