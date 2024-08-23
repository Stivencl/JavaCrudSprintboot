package com.parquesoftti.c26a.services;

import com.parquesoftti.c26a.Model.Order;

import java.util.List;

public interface OrderService {
    public List<Order> findAll();
    public Order findById(Long id);
    public Order save(Order order);
    public Order update(Order order);
    public void delete(Long id);
}
