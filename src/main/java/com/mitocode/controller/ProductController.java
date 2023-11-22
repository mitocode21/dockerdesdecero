package com.mitocode.controller;

import com.mitocode.model.Product;
import com.mitocode.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping
    public List<Product> listAll(){
        return service.findAll();
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return service.save(product);
    }
}
