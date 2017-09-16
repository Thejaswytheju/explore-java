package com.theja.java.study.explorejava.hashcode;

import org.junit.Assert;
import org.junit.Test;

public class Employee3Test {
    @Test
    public void equalsTestWithDifference3() {
        Employee2 e3 = new Employee3();
        Employee2 e4 = new Employee3();
        e3.setDept("eee");
        e3.setName("chintu");
        e3.setId(1234L);
        e4.setDept("cse");
        e4.setName("kutty");
        e4.setId(1236L);
        boolean results = e3.equals(e4);
        Assert.assertFalse(results);
        System.out.println("e3 hash code:"+e3.hashCode());
        System.out.println("e4 hash code:"+e4.hashCode());

    }

    @Test
    public void equalsTestWithDifference2() {
        Employee2 e3 = new Employee3();
        Employee e4 = new Employee3();
        e3.setDept("eee");
        e3.setName("chintu");
        e3.setId(1234L);
        e4.setDept("eee");
        e4.setName("kutty");
        e4.setId(1236L);
        boolean results = e3.equals(e4);
        Assert.assertFalse(results);
    }

    @Test
    public void equalsTestWithDifference1() {
        Employee2 e3 = new Employee3();
        Employee e4 = new Employee3();
        e3.setDept("eee");
        e3.setName("chintu");
        e3.setId(1234L);
        e4.setDept("eee");
        e4.setName("chintu");
        e4.setId(1236L);
        boolean results = e3.equals(e4);
        Assert.assertFalse(results);
    }



    @Test
    public void equalsTestWithNoDifference() {
        Employee3 e3 = new Employee3();
        Employee e4 = new Employee3();
        e3.setDept("eee");
        e3.setName("chintu");
        e3.setId(1234L);
        e4.setDept("eee");
        e4.setName("chintu");
        e4.setId(1234L);
        boolean results = e3.equals(e4);
        Assert.assertTrue(results);
    }
}
