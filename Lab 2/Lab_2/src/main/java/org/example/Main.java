package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Runnable task=new MyTask();
        Thread t=new Thread(task);

        t.start();
    }
}