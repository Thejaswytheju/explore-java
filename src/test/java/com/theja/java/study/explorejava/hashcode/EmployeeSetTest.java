package com.theja.java.study.explorejava.hashcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSetTest {

    @Test
    public void setExample() {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Set<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        Assert.assertEquals(2, employeeSet.size());
        Employee e3 = e2;
        employeeSet.add(e2);
        employeeSet.add(e1);
        employeeSet.add(e3);
        Assert.assertEquals(2, employeeSet.size());
    }
    @Test
    public void setExample2() {
        Employee e1 = new Employee6("abcd", 100L, "cse");
        Employee e2 = new Employee6("xyz", 100L, "eee");
        Employee e3 = new Employee6("mnop", 200L, "ece");

        Set<Employee> employeeSet = new HashSet<Employee>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        Assert.assertEquals(2, employeeSet.size());
        employeeSet.add(e2);
        employeeSet.add(e1);
        Assert.assertEquals(2, employeeSet.size());
        System.out.println(employeeSet);
    }
}
