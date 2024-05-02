package com.saivikas.adapter;

public class Client {
    public static void main(String[] args) {
        EmployeeRepository.getEmployeeDetails().forEach(employee -> {
            System.out.println("Employee ID: " + employee.getId());
            System.out.println("Employee First Name: " + employee.getFirstName());
            System.out.println("Employee Last Name: " + employee.getLastName());
            System.out.println("Employee Email: " + employee.getEmail());
        });
    }
}
