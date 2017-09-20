package com.theja.java.study.explorejava.exceptions;

import org.junit.Test;

public class MyOwnUncheckedExceptionTest {

    @Test
    public void test() {
        MyOwnUncheckedException ue = new MyOwnUncheckedException();
        throw ue;
    }
}
