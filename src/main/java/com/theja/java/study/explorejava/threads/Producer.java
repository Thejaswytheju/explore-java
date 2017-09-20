package com.theja.java.study.explorejava.threads;

import java.util.Date;
import java.util.Vector;

class Producer extends Thread {

    static final int MAXQUEUE = 5;
    private Vector messages = new Vector();

    @Override
    public void run() {
        try {
            while (true) {
                putMessage();
                sleep(5000);
            }
        } catch (InterruptedException e) {
        }
    }

    private synchronized void putMessage() throws InterruptedException {
        int i=1;
        while (messages.size() == MAXQUEUE) {
            System.out.println(i + " :messages Q is full. Hence going to wait state");
            wait();
            System.out.println(i + " :Came out of wait state");
        }
        Date date = new Date();
        String dateString = date.toString();
        messages.addElement(dateString);
        System.out.println("Added message to Q: "+dateString);
        notify();
        //Later, when the necessary event happens, the thread that is running it calls notify() from a block synchronized on the same object.
    }

    // Called by Consumer
    public synchronized String getMessage() throws InterruptedException {
        int i = 1;

        while (messages.size() == 0) {
            System.out.println(i + " :messages size is empty. Hence going to wait state");
            wait();//By executing wait() from a synchronized block, a thread gives up its hold on the lock and goes to sleep.
            System.out.println(i + " :Waiting over. Got lock.");
        }
        String message = (String) messages.firstElement();
        messages.removeElement(message);
        System.out.println("message read is: "+message);

        notify();

        return message;
    }

}
