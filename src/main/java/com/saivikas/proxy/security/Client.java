package com.saivikas.proxy.security;

public class Client {
    public static void main(String[] args) {
        SensitiveResource resource = new SecurityProxy("admin");
        resource.accessResource();
    }
}
