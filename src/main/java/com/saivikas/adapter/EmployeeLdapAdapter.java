package com.saivikas.adapter;

public class EmployeeLdapAdapter implements Employee{
    private final EmployeeLdap instance;

    public EmployeeLdapAdapter(EmployeeLdap instance) {
        this.instance = instance;
    }

    @Override
    public int getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
