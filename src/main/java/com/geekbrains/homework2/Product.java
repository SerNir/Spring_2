package com.geekbrains.homework2;

public class  Product {
    private int id;
    private String name;
    private float price;

    public int getId() {
        return id;
    }

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
