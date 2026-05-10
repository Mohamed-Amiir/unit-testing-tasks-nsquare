package org.example;

import com.example.counter.Counter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Counter counter = new Counter(100);
       counter.increment();
    }
}