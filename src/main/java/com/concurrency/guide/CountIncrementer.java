package com.concurrency.guide;

public class CountIncrementer implements Runnable{

    private RequestCounter requestCounter;

    public CountIncrementer(RequestCounter requestCounter) {
        this.requestCounter = requestCounter;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();


        if ((Integer.parseInt(name.split("-")[1]))%2 == 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("====="+name+"========");
        System.out.println(requestCounter.getCount());
        if ((Integer.parseInt(name.split("-")[1]))%2 == 0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        requestCounter.incrementCount();
        System.out.println(requestCounter.getCount());
        System.out.println("====="+name+"========");

        System.out.println();
        System.out.println();
        System.out.println();

    }
}
