package com.kavish.ordermanagement.controller;

import com.kavish.ordermanagement.service.OrderManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderManagementController {

    @Autowired
    OrderManagementService orderManagementService;

    @GetMapping("/orderDetails")
    public String getOrderDetails(){
        return orderManagementService.getOrderDetails();
    }
}
