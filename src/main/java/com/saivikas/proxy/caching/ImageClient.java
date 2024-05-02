package com.saivikas.proxy.caching;

public class ImageClient {
    public static void main(String[] args) {
        Image image = new ImageProxy("test.jpg");
        image.display();
    }
}
