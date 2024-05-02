package com.saivikas.proxy.caching;

import java.util.HashMap;
import java.util.Map;

public class ImageProxy implements Image{
    private RealImage realImage;
    private final String fileName;
    private Map<String, RealImage> cache = new HashMap<>();

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(cache.containsKey(fileName))
            realImage = cache.get(fileName);
        else {
            realImage = new RealImage(fileName);
            cache.put(fileName, realImage);
        }
        realImage.display();
    }
}
