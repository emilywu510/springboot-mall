package com.emilywu.springboot_mall.service;

import com.emilywu.springboot_mall.dto.CreateOrderRequest;
import com.emilywu.springboot_mall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
