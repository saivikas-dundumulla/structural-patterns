package com.saivikas.adapter;

public class EmployeeFromCsvAdapter implements Employee{
    private final EmployeeFromCsv instance;

    public EmployeeFromCsvAdapter(EmployeeFromCsv instance) {
        this.instance = instance;
    }

    @Override
    public int getId() {
        return instance.getId();
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getFirstName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
