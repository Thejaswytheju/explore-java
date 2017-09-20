package com.theja.java.study.explorejava.hashcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Employee7SetTest {

    @Test
    public void hashSet1(){
        Set<Employee> set = new HashSet<Employee>();
        Employee e1 = new Employee7("aaa", 1L, "cse");
        Employee e2 = new Employee7("ccc", 1L, "cse");
        Employee e5 = new Employee7("ccc", 1L, "cse");
        Employee e3 = new Employee7("aaa", 1L, "cse");
        Employee e4 = new Employee7("bbb", 1L, "cse");
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Assert.assertEquals(3, set.size());
        System.out.println("Emploee set without duplicates is:\n"+set);
    }

    @Test
    public void setWithInsertionOrder() {
        Set<Employee> set = new LinkedHashSet<Employee>();
        Employee e1 = new Employee7("aaa", 1L, "cse");
        Employee e2 = new Employee7("ccc", 1L, "cse");
        Employee e5 = new Employee7("ccc", 1L, "cse");

        Employee e3 = new Employee7("aaa", 1L, "cse");
        Employee e4 = new Employee7("bbb", 1L, "cse");
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Assert.assertEquals(3, set.size());
        System.out.println("Emploee set without duplicates is:\n"+set);
    }

    @Test
    public void setWithSortedOrder() {
        Set<Employee> set = new TreeSet<Employee>();
        Employee e1 = new Employee7("aaa", 1L, "cse");
        Employee e2 = new Employee7("ccc", 1L, "cse");
        Employee e5 = new Employee7("ccc", 1L, "cse");
        Employee e3 = new Employee7("aaa", 1L, "cse");
        Employee e4 = new Employee7("bbb", 1L, "cse");
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        Assert.assertEquals(3, set.size());
        System.out.println("Emploee set without duplicates is:\n"+set);
    }

    @Test
    public void list(){
        List<Employee> arrayList = new ArrayList<Employee>();
        Employee e1 = new Employee7("aaa", 1L, "cse");
        Employee e2 = new Employee7("ccc", 1L, "cse");
        Employee e5 = new Employee7("ccc", 1L, "cse");

        Employee e3 = new Employee7("aaa", 1L, "cse");
        Employee e4 = new Employee7("bbb", 1L, "cse");
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);
        arrayList.add(e5);
        arrayList.add(e5);
        Assert.assertEquals(7, arrayList.size());
        System.out.println("Employee list with duplicates is:\n"+arrayList);
    }

}
