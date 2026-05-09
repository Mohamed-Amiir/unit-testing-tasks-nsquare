package com.example.stopwatch;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StopwatchTest {

    @Test
    void testInitialStateIsZero() {
        Stopwatch sw = new Stopwatch();

        assertEquals(0, sw.getMinutes());
        assertEquals(0, sw.getHours());
        assertEquals(0, sw.getDays());
    }

    @Test
    void testAddMinutesBasic() {
        Stopwatch sw = new Stopwatch();

        sw.addMinutes(10);

        assertEquals(10, sw.getMinutes());
    }

    @Test
    void testNegativeInputIgnored() {
        Stopwatch sw = new Stopwatch();

        sw.addMinutes(-50);

        assertEquals(0, sw.getMinutes());
        assertEquals(0, sw.getHours());
        assertEquals(0, sw.getDays());
    }

    @Test
    void testMinutesConvertToHours() {
        Stopwatch sw = new Stopwatch();

        sw.addMinutes(120);

        assertEquals(2, sw.getHours());
        assertEquals(0, sw.getMinutes());
    }

    @Test
    void testHoursConvertToDays() {
        Stopwatch sw = new Stopwatch();

        sw.addMinutes(60 * 25);

        assertEquals(1, sw.getDays());
        assertEquals(1, sw.getHours());
    }
}