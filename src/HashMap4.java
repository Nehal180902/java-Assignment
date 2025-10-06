//Q4. Write a program to demonstrate the difference between HashMap
// and ConcurrentHashMap in a multithreaded environment.

import java.util.*;
import java.util.concurrent.*;

public class HashMap4 {
    public static void main(String[] args) throws InterruptedException {
        // HashMap (not thread-safe)
        Map<Integer, String> hashMap = new HashMap<>();

        // ConcurrentHashMap (thread-safe)
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();

        System.out.println("=== HashMap Test (Not Thread-Safe) ===");
        runTest(hashMap);

        System.out.println("\n=== ConcurrentHashMap Test (Thread-Safe) ===");
        runTest(concurrentMap);
    }

    // Method to run test with multiple threads
    private static void runTest(Map<Integer, String> map) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, Thread.currentThread().getName());
            }
        };

        // Run with 5 threads
        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");
        Thread t3 = new Thread(task, "T3");
        Thread t4 = new Thread(task, "T4");
        Thread t5 = new Thread(task, "T5");

        t1.start(); t2.start(); t3.start(); t4.start(); t5.start();

        t1.join(); t2.join(); t3.join(); t4.join(); t5.join();

        System.out.println("Final size: " + map.size());
        // Printing a few entries to check who wrote them
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " => " + map.get(i));
        }
    }
}