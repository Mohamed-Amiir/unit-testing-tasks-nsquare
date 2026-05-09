package com.example.counter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void testIncrementWrapsAround() {
        Counter counter = new Counter(3);

        assertEquals(0, counter.getValue());

        counter.increment();
        counter.increment();
        counter.increment(); // 0

        assertEquals(0, counter.getValue());
    }

    @Test
    void testAddWorksWithWrap() {
        Counter counter = new Counter(5);

        counter.add(3); // 3
        assertEquals(3, counter.getValue());

        counter.add(3); // 6 % 5 = 1
        assertEquals(1, counter.getValue());
    }

    @Test
    void testReset() {
        Counter counter = new Counter(4);

        counter.increment();
        counter.increment();

        counter.reset();

        assertEquals(0, counter.getValue());
    }
}