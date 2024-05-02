package com.saivikas.composite;

public class Product extends PackageComponent {
    public Product(String name, int price) {
        super(name, price);
    }

    @Override
    public int totalCost() {
        return super.price;
    }
}
