package com.geekbrains.homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Cart cart = applicationContext.getBean(Cart.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);
   /*     System.out.println(productRepository.findById(2));
        List<Product> list = new ArrayList<>();*/



//        cart.addProductToCart(2);
//        cart.addProductToCart(3);
//        cart.addProductToCart(4);
//        cart.addProductToCart(5);
//        cart.addProductToCart(2);
//        cart.addProductToCart(1);

        cart.printCart();


        applicationContext.close();
    }
}
