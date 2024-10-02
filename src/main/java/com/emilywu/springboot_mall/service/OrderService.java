package com.emilywu.springboot_mall.service;

import com.emilywu.springboot_mall.dto.CreateOrderRequest;

public interface OrderService {

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
