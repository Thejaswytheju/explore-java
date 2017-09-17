package com.theja.java.study.explorejava;

import com.theja.java.study.explorejava.hashcode.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeOutsidePackageTest {
    private Employee cut;

    @Before
    public void setup(){
        cut = new Employee();
    }

    @Test
    public void getName() {
        //cut.name = "abcd";
        //Assert.assertEquals("theja", cut.getName());
        cut.setName("theja");
        String name = cut.getName();
        Assert.assertEquals("theja", name);
    }

}
