package org.example;

//THREAD (EXTENDING THREAD)
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello from MyThread");
    }
}
