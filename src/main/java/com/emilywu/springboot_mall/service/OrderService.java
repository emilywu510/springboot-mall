package com.emilywu.springboot_mall.service;

import com.emilywu.springboot_mall.dto.CreateOrderRequest;
import com.emilywu.springboot_mall.dto.OrderQueryParams;
import com.emilywu.springboot_mall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
