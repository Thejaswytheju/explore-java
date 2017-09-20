package com.theja.java.study.explorejava.exceptions;

import com.theja.java.study.explorejava.hashcode.Employee;
import org.junit.Test;

public class RunTimeExceptionsTest {

    public static void main(String args[])
    {
        try {
            RunTimeExceptions cut = new RunTimeExceptions();
            Employee e = new Employee();
            cut.throwException(e);
        } catch (Exception e) {
            System.out.println("got exception. exception name is : "+e.getClass().getName());
            System.out.println("got exception. exception null is : "+e.getMessage());
            System.out.println("stack trace: ");
            e.printStackTrace();
        }

    }

    @Test(expected = RuntimeException.class)
    public void test() {
        RunTimeExceptions cut = new RunTimeExceptions();
        Employee e = new Employee();
        cut.throwException(e);
    }
}
