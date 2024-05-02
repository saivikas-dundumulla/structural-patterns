package com.saivikas.proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        CustomService customService = new CustomServiceImpl();
        CustomInvocationHandler<CustomService> customHandler = new CustomInvocationHandler<>(customService);
        CustomService proxy = (CustomService) Proxy.newProxyInstance(customService.getClass().getClassLoader(),
                new Class[]{CustomService.class},
                customHandler);
        proxy.doSomething();
    }
}
