package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderRepository orderrepos;

    @Override
    public Order save(Order order) {
        return orderrepos.save(order);
    }
}
