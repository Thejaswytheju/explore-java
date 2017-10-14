package com.theja.java.study.explorejava.sort;

import com.theja.java.study.explorejava.hashcode.Employee;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        if(o2.getName() == null) {
            return 1;
        }
        if(o1.getName() == null) {
            return -1;
        }

        return o1.getName().compareTo(o2.getName());
    }
}
