package com.theja.java.study.explorejava.sort;

import com.theja.java.study.explorejava.hashcode.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SorterTest {

    @Test
    public void sort() {
        Employee e1 = new Employee();
        e1.setName("varshi");
        Employee e2 = new Employee("chintu");
        Sorter<Employee> empSorter = new Sorter<Employee>();
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        empSorter.sort(employees);
        System.out.println(employees);
        Assert.assertTrue(employees.get(0).getName().equals("chintu"));
        Assert.assertTrue(employees.get(1).getName().equals("varshi"));


    }

}
