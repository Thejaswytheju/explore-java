package com.theja.java.study.explorejava.threads;

import org.junit.Test;

public class PrintingTaskTest {

    public static void main(String [] args) {
        PrintingTaskTest test = new PrintingTaskTest();
        test.test1();
        System.out.println("completed");
    }


    public void test1() {

        PrintingTask task = new PrintingTask();

        Thread t1 = createThread(task, "t1");
        Thread t2 = createThread(task, "t2");
        Thread t3 = createThread(task, "t3");
        Thread t4 = createThread(task, "t4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("Iam done");

    }

    private Thread createThread(PrintingTask task, String name) {
        Thread t = new Thread(task);
        t.setName(name);
        return  t;

    }

    @Test
    public void staticSynchronized() {

    }
}
