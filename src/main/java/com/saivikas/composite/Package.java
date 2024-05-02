package com.saivikas.composite;

public class Package extends PackageComponent {
    public Package(String name, int price) {
        super(name, price);
    }

    @Override
    public int totalCost() {
        return components.stream()
                .map(PackageComponent::totalCost)
                .reduce(price, Integer::sum);
    }
    @Override
    public void add(PackageComponent p){
        components.add(p);
    }
    @Override
    public void remove(PackageComponent p){
        components.remove(p);
    }
}
