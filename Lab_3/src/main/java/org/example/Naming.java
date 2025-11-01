package org.example;
//Java - Thread Naming
public class Naming {
    public static void main(String[] args) {
      //  Naming During Thread Creation
        Thread t1 = new Thread("MyFirstThread");
        t1.start();
        System.out.println("Thread Name: "+ t1.getName());
    //Using setName() Method
        Thread t2 = new Thread();
        t2.setName("WorkerThread-1");
        t2.start();
        System.out.println("Thread Name: "+ t2.getName());
//Naming Threads with Runnable
        Runnable task =()-> System.out.println("Running in: " +
        Thread.currentThread().getName());
        Thread t3 = new Thread(task,"RunnableThread");
        t3.start();

    }
}