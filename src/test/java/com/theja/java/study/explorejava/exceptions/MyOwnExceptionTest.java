package com.theja.java.study.explorejava.exceptions;

import org.junit.Test;

public class MyOwnExceptionTest {

    @Test(expected = MyOwnException.class)
    public void test() throws MyOwnException{
        MyOwnException e = new MyOwnException("custom exception");
        throw e;
    }
}
