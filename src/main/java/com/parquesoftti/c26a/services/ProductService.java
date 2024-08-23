package com.parquesoftti.c26a.services;

import com.parquesoftti.c26a.Model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public Product findById(Long id);
    public Product save(Product product);
    public Product update(Product product);
    public void  delete (Long id);
}
