package com.saivikas.bridge;

public class Netflix extends Video {
    public Netflix(Processor processor) {
        super(processor);
    }

    @Override
    public void play() {
        System.out.println("Playing Netflix video");
        processor.play();
    }
}
