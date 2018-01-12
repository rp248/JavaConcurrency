package com.concurrency.guide;

public class RaceConditionTester {
    public static void main(String a[]) {
        RequestCounter requestCounter = new RequestCounter();
        for (int i = 0; i < 10; i++) {
            CountIncrementer countIncrementer = new CountIncrementer(requestCounter);
            Thread tester = new Thread(countIncrementer, "CountIncrementer-"+i);
            tester.start();
        }
    }
}
