package com.geekbrains.homework2;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> productList;

    @PostConstruct
    public void init() {
        this.productList = new ArrayList<>();
        productList.add(new Product(1,"orange", 195f));
        productList.add(new Product(2,"apple", 150f));
        productList.add(new Product(3,"strawberry", 232.80f));
        productList.add(new Product(4,"cherry", 350.90f));
        productList.add(new Product(5,"mango", 499.90f));
    }

    public Product findById(int id){
        for (Product product: productList) {
            if(product.getId()==id){
                return product;
            }

        }
       throw new RuntimeException("Product not found");
    }
}
