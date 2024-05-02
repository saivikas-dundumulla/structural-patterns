package com.saivikas.composite;

public class Client {
    public static void main(String[] args) {
        Package package1 = new Package("Package 1", 5);
        Product product1 = new Product("Product 1", 10);
        Product product2 = new Product("Product 2", 20);
        Product product3 = new Product("Product 3", 30);
        package1.add(product1);
        package1.add(product2);
        package1.add(product3);

        Package package2 = new Package("Package 2", 2);
        Product product4 = new Product("Product 4", 40);
        Product product5 = new Product("Product 5", 50);
        package2.add(product4);
        package2.add(product5);
        package1.add(package2);

        System.out.println("Total price of Package 1: " + package1.totalCost());
    }
}
