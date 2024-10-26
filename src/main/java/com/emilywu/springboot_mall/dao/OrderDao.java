package com.emilywu.springboot_mall.dao;

import com.emilywu.springboot_mall.dto.OrderQueryParams;
import com.emilywu.springboot_mall.model.Order;
import com.emilywu.springboot_mall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOrderItems (Integer orderId, List<OrderItem> orderItemList);
}
