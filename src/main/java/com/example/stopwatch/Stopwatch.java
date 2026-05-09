package com.example.stopwatch;

public class Stopwatch {

    private int minutes;
    private int hours;
    private int days;

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getDays() {
        return hours;
    }

    public void addMinutes(int minutes) {
        if (minutes > 0 ) {
            this.minutes += minutes;

            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
    }
}