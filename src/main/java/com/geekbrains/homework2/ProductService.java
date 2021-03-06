package com.geekbrains.homework2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public Product findById(int id) {
        return productRepository.findById(id);
    }
}
