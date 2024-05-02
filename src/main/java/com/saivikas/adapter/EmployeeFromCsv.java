package com.saivikas.adapter;

import java.util.StringTokenizer;

public class EmployeeFromCsv {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    public EmployeeFromCsv(String values){
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        this.id = Integer.parseInt(tokenizer.nextToken());
        this.firstName = tokenizer.nextToken();
        this.lastName = tokenizer.nextToken();
        this.emailAddress = tokenizer.nextToken();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
