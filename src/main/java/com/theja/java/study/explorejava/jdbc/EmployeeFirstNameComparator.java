package com.theja.java.study.explorejava.jdbc;

import java.util.Comparator;

public class EmployeeFirstNameComparator implements Comparator<Employee>{
    public int compare(Employee o1, Employee o2) {
        if(o1.getFirstName() == null) {
            return -1;
        }
        if(o2.getFirstName() == null) {
            return 1;
        }
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
