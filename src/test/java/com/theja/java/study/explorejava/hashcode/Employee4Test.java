package com.theja.java.study.explorejava.hashcode;

import org.junit.Assert;
import org.junit.Test;

public class Employee4Test {

    @Test
    public void constructor(){
        Employee4 e4=new Employee4();
        Employee4 e5=new Employee4("kutty",1234L);
        Assert.assertEquals("kutty", e5.getName());

    }
    @Test
    public void constructor2(){
        Employee e5=new Employee();
        Employee e6=new Employee("chintu",1236L);
        Assert.assertEquals("chintu",e6.getName());
        Employee4 e7= new Employee4("xyz", 100L, "cse");
}




}


