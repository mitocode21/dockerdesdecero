package com.mitocode.service;

import com.mitocode.model.Product;

import java.util.List;

public interface ProductService {

    Product save(Product product);
    List<Product> findAll();
}
