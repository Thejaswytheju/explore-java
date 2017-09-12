package com.theja.java.study.explorejava.hashcode;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by jayasekhar on 9/12/2017.
 */
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


}
