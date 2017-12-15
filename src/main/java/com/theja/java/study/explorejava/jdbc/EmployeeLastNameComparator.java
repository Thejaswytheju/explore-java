package com.theja.java.study.explorejava.jdbc;

import java.util.Comparator;

import java.util.Comparator;

public class EmployeeLastNameComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        if(o1.getLastName() == null) {
            return -1;
        }
        if(o2.getLastName() == null) {
            return 1;
        }
        return o1.getLastName().compareTo(o2.getFirstName());
    }
}

