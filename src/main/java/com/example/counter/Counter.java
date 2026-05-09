package com.example.counter;

public class Counter {

    private int value;
    private final int limit;

    public Counter(int limit) {
        if (limit <= 0) {
            throw new IllegalArgumentException("Limit must be > 0");
        }
        this.limit = limit;
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value = (value + 1) % limit;
    }

    public void add(int step) {
        value = (value + step) % limit;
    }

    public void reset() {
        value = 0;
    }
}