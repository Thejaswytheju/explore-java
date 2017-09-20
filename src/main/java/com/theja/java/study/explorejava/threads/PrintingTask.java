package com.theja.java.study.explorejava.threads;

public class PrintingTask implements Runnable {

    private static int objectsCreated;

    private int printCount;

    public PrintingTask() {
        System.out.println("I am being created by: "+Thread.currentThread().getName());
        incrementObjectsCount();
    }



    public synchronized void print() {
        printCount += 1;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(printCount + " : I am being run by the thread named: "+ Thread.currentThread().getName());
    }

    public static synchronized void incrementObjectsCount() {
        objectsCreated += 1;
        System.out.println("so far the no.of objects created are:"+objectsCreated);
    }

    public static synchronized int getObjectsCreatedCount() {
        return objectsCreated;
    }

    public void run() {
        print();
    }
}
