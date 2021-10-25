package com.lessons.hw.lesson6;

public class Dog extends Animal {

    public static final int DEFAULT_MAX_SWIM_DISTANCE = 10;
    public static final int DEFAULT_MAX_RUN_DISTANCE = 500;

    public static int dogCount = 0;

    public Dog(String name, int maxSwimDistance, int maxRunDistance) {
        super(name, maxSwimDistance, maxRunDistance);
        dogCount++;
    }

    public Dog(String name) {
        this(name, DEFAULT_MAX_SWIM_DISTANCE, DEFAULT_MAX_RUN_DISTANCE);
    }

    public static int getCount() {
        return dogCount;
    }
}
