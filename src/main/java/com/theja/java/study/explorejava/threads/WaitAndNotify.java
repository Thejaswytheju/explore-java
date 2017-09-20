package com.theja.java.study.explorejava.threads;

public class WaitAndNotify {

    public static void main(String args[]) {
        Producer producer = new Producer();
        producer.start();
        Consumer consumer = new Consumer(producer);
        consumer.start();
    }

}
