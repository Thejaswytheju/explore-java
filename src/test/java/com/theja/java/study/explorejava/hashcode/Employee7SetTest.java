package com.theja.java.study.explorejava.hashcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Employee7SetTest {

    @Test
    public void hashSet1(){
        Set<Employee> set = new HashSet<Employee>();
        Employee e1 = new Employee7("aaa", 1L, "cse");
        Employee e2 = new Employee7("aaa", 1L, "cse");
        Employee e3 = new Employee7("aaa", 1L, "cse");
        Employee e4 = new Employee7("bbb", 1L, "cse");
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        Assert.assertEquals(2, set.size());
        System.out.println("Emploee set without duplicates is:\n"+set);
    }
}
