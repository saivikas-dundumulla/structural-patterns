package com.saivikas.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EmployeeRepository {
    public static final List<Employee> employees = new ArrayList<>();
    public static List<Employee> getEmployeeDetails(){
        EmployeeDB employeeDB = new EmployeeDB(1, "Sai", "Vikas", "vikas@gmail.com");
        employees.add(employeeDB);
        EmployeeLdap employeeLdap = new EmployeeLdap(2, "praveen", "rathod", "praveen@gmail.com");
        employees.add(new EmployeeLdapAdapter(employeeLdap));
        EmployeeFromCsv employeeFromCsv = new EmployeeFromCsv("3,pradeep,reddy,pradeep@gmail.com");
        employees.add(new EmployeeFromCsvAdapter(employeeFromCsv));
        return employees;
    }
}
