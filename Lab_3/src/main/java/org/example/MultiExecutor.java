package org.example;
import java.util.*;
// Lab Excercise
public class MultiExecutor {

    // list to store all the tasks
    private List<Runnable> tasks;

    // constructor takes the list of tasks
    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    // method to start all tasks together
    public void executeAll() {
        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            thread.start(); // start each task in a new thread
        }
    }

    // main method to test
    public static void main(String[] args) {
        List<Runnable> myTasks = new ArrayList<>();

        myTasks.add(() -> System.out.println("Task 1 running in " + Thread.currentThread().getName()));
        myTasks.add(() -> System.out.println("Task 2 running in " + Thread.currentThread().getName()));
        myTasks.add(() -> System.out.println("Task 3 running in " + Thread.currentThread().getName()));

        MultiExecutor executor = new MultiExecutor(myTasks);
        executor.executeAll();
    }
}
