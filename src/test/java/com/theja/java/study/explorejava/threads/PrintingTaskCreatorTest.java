package com.theja.java.study.explorejava.threads;

public class PrintingTaskCreatorTest {

    public static void main(String [] args) {
        PrintingTaskCreatorTest test = new PrintingTaskCreatorTest();
        test.test1();
        System.out.println("completed");
    }


    public void test1() {

        PrintingTaskCreator task = new PrintingTaskCreator();

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


    private Thread createThread(PrintingTaskCreator task, String name) {
        Thread t = new Thread(task);
        t.setName(name);
        return  t;
    }
}
