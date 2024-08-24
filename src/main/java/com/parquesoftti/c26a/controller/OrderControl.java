package com.parquesoftti.c26a.controller;

import com.parquesoftti.c26a.Model.Customer;
import com.parquesoftti.c26a.Model.Order;
import com.parquesoftti.c26a.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderControl {

    private final OrderService orderService;

    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }
    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id){
        return orderService.findById(id);
    }

    @PostMapping
    public Order save(@RequestBody Order order){
        return orderService.save(order);
    }

    @PostMapping("/{id}")
    public void delete(@PathVariable Long id){
        orderService.delete(id);
    }

    @PutMapping("{id}")
    public Order update(@PathVariable Long id, @RequestBody Order order){
        return orderService.update(id, order);

    }

}
