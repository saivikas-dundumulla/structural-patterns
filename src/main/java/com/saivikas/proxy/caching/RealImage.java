package com.saivikas.proxy.caching;

public class RealImage implements Image{
    private final String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading From Disk" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying the image: "+ fileName);
    }
}
