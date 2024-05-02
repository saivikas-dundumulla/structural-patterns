package com.saivikas.facade;

public class Facade {
    private Service service;

    public Facade() {
        this.service = new Service();
    }

    public void startService() {
        service.start();
    }

    public void stopService() {
        service.stop();
    }
}
