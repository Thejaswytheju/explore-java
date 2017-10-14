package com.theja.java.study.explorejava.threads;
public class Consumer extends Thread {

    Producer producer;

    Consumer(Producer p) {
        producer = p;
    }

    @Override
    public void run() {
        try {
            while (true) {
                StringBuffer sb = new StringBuffer();
                StringBuilder sss = new StringBuilder();
                String message = producer.getMessage();
                System.out.println("Got message: " + message);
                sleep(10000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
