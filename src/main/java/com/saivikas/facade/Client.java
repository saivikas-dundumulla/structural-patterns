package com.saivikas.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startService();
        facade.stopService();
    }
}
