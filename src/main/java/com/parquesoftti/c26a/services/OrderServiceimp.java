package com.parquesoftti.c26a.services;

import com.parquesoftti.c26a.Model.Order;
import com.parquesoftti.c26a.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceimp implements OrderService{
    final OrderRepository orderRepository;

    @Override
    public List<Order> findAll(){
        return  orderRepository.findAll();
    }

    @Override
    public Order findById(Long id){
        return  orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order save(Order order){
        return orderRepository.save(order);

    }

    @Override
    public Order update(Order order){
        return orderRepository.save(order);

    }
    @Override
    public void delete(Long id){
        orderRepository.deleteById(id);
    }
}
