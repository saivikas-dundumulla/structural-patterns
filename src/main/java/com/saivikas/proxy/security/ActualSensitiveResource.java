package com.saivikas.proxy.security;

public class ActualSensitiveResource implements SensitiveResource{
    @Override
    public void accessResource() {
        System.out.println("Accessing the sensitive resource");
    }
}
