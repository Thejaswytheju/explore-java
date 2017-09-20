package com.theja.java.study.explorejava.threads;

public class PrintingTaskCreator implements Runnable{
    public void run() {
        PrintingTask task = new PrintingTask();
    }
}
