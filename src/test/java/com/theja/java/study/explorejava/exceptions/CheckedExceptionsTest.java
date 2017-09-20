package com.theja.java.study.explorejava.exceptions;

import org.junit.Test;

public class CheckedExceptionsTest {

    @Test(expected = Exception.class)
    public void test() throws Exception {
        CheckedExceptions checkedExceptions = new CheckedExceptions();
        checkedExceptions.throwException();
    }
}
