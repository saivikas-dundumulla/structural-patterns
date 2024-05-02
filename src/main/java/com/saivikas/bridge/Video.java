package com.saivikas.bridge;

public abstract class Video {
    protected Processor processor;

    public Video(Processor processor) {
        this.processor = processor;
    }

    public abstract void play();
}
