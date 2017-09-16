package com.theja.java.study.explorejava.hashcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    private Employee cut;

    @Before
    public void setup(){
        cut = new Employee();
    }

    @Test
    public void getName() {
        cut.setName("theja");
        String name = cut.getName();
        Assert.assertEquals("theja", name);
    }

    @Test
    public void equals() {
        Employee e1=new Employee();
        Employee e2 = new Employee();
        boolean results = e1.equals(e2);
        Assert.assertFalse(results);
        Employee e3 = e1;
        results = e3.equals(e1);
        Assert.assertTrue(results);
        Employee e4 = e3;
        results = e4.equals(e3);
        Assert.assertTrue(results);
        results = e4.equals(e1);
        Assert.assertTrue(results);
    }

    @Test
    public void hashValue() {
        Employee e1=new Employee();
        Employee e2 = new Employee();
        int e1HashValue = e1.hashCode();
        int e2HashValue = e2.hashCode();
        System.out.println(e1HashValue);
        System.out.println(e2HashValue);
        Employee e3 = e1;
        int e3Hash = e3.hashCode();
        Assert.assertEquals(e3Hash, e1HashValue);
    }

    @Test
    public void constructor() {
        Employee e= new Employee("theja");
        System.out.println(e.getName());

    }


}
