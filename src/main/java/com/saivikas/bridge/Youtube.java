package com.saivikas.bridge;

public class Youtube extends Video {
    public Youtube(Processor processor) {
        super(processor);
    }

    @Override
    public void play() {
        System.out.println("Playing Youtube video");
        processor.play();
    }
}
