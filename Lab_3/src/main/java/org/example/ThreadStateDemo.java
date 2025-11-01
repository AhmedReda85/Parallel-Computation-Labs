package org.example;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("State inside run(): " +
                    Thread.currentThread().getState());
        });
// State 1: NEW
        System.out.println("Before start(): " + t1.getState());
// State 2: RUNNABLE
        t1.start();
        System.out.println("After start(): " + t1.getState());
// Wait until the thread finishes
        t1.join();
// State 3: TERMINATED
        System.out.println("After completion: " + t1.getState());
    }
}