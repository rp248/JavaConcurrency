package com.concurrency.guide;

public class RequestCounter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        ++count;
    }
}
