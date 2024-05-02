package com.saivikas.bridge;

public class Client {
    public static void main(String[] args) {
        Processor processor = new HD();
        Video video = new Youtube(processor);
        video.play();
    }
}
