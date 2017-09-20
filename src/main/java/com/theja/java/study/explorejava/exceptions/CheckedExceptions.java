package com.theja.java.study.explorejava.exceptions;

public class CheckedExceptions {
    public void throwException() throws Exception {
        Exception x = new Exception("Newly created Exception");
        throw x;
    }
}
