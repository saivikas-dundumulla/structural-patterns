package com.saivikas.adapter;

public class EmployeeLdap {
    private final int cn;
    private final String givenName;
    private final String surname;
    private final String mail;

    public EmployeeLdap(int cn, String givenName, String surname, String mail) {
        this.cn = cn;
        this.givenName = givenName;
        this.surname = surname;
        this.mail = mail;
    }

    public int getCn() {
        return cn;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }
}
