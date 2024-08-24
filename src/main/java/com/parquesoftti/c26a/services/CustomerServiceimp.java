package com.parquesoftti.c26a.services;
import com.parquesoftti.c26a.Model.Customer;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import com.parquesoftti.c26a.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceimp implements CustomerService{

    final CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(Long id, Customer customer) {
        Customer customerTmp = customerRepository.findById(id)
                .orElseThrow(()->new RuntimeException("customer not find"));
        customerTmp.setCustomerName(customer.getCustomerName());
        customerTmp.setEmail(customer.getEmail());
        customerTmp.setPhoneNumber(customer.getPhoneNumber());

        return customerRepository.save(customerTmp);
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

}
