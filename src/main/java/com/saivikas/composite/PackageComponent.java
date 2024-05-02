package com.saivikas.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class PackageComponent {
    String name;
    int price;
    List<PackageComponent> components = new ArrayList<>();

    public PackageComponent(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract int totalCost();

    public void add(PackageComponent p){
        throw new UnsupportedOperationException();
    }

    public void remove(PackageComponent p){
        throw new UnsupportedOperationException();
    }
}
