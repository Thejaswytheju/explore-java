package com.theja.java.study.explorejava.hashcode;

import org.junit.Assert;
import org.junit.Test;

public class Employee2Test {
    @Test
    public void equals() {
        Employee2 e1=new Employee2();
        Employee2 e2=new Employee2();
        boolean results = e1.equals(e2);
        Assert.assertTrue(results);
        results = e1.equals(null);
        Assert.assertTrue(results);
    }

    @Test
    public  void hashvalue() {
        Employee2 e1=new Employee2();
        Employee2 e2=new Employee2();
        int e1hashvalue=e1.hashCode();
        int e2hashvalue=e2.hashCode();
        Assert.assertNotEquals(e1hashvalue, e2hashvalue);
    }

}
