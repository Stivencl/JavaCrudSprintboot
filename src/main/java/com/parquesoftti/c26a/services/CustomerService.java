package com.parquesoftti.c26a.services;

import com.parquesoftti.c26a.Model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();
    public Customer findById(Long id);
    public Customer save(Customer customer);
    public  Customer update(Long id, Customer customer);
    public  void delete(Long id);
}
