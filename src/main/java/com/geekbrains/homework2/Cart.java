package com.geekbrains.homework2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    ProductRepository productRepository;
    ProductService productService;
    private List<Product> cartList;

    public Cart() {
        this.cartList = new ArrayList<>();
    }


    public void addProductToCart(int id) {
        System.out.println(productService.findById(id));
//        cartList.add(productRepository.findById(id));

    }

    public void removeProductFromCart(int id) {
        cartList.remove(productRepository.findById(id));
    }

    public void printCart() {
        for (Product product : cartList) {
            System.out.println(product);

        }
    }
}
