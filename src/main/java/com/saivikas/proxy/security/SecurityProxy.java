package com.saivikas.proxy.security;

public class SecurityProxy implements SensitiveResource{
    private SensitiveResource actualResource;
    private final String userName;

    public SecurityProxy(String userName) {
        this.userName = userName;
    }
    public boolean checkAccess(){
        return "admin".equals(userName);
    }

    @Override
    public void accessResource() {
        if(checkAccess()){
            if(actualResource == null)
                actualResource = new ActualSensitiveResource();
            actualResource.accessResource();
        } else {
            System.out.println("Access Denied");
        }
    }
}
