package com.lessons.hw.lesson6;

public class Cat extends Animal{

    public static final int DEFAULT_MAX_SWIM_DISTANCE = 0;
    public static final int DEFAULT_MAX_RUN_DISTANCE = 200;
    public static int catCount = 0;

    public Cat(String name, int maxRunDistance) {
        super(name, DEFAULT_MAX_SWIM_DISTANCE, maxRunDistance);
        catCount++;
    }

    public Cat (String name) {
        this(name,DEFAULT_MAX_RUN_DISTANCE);
    }

    @Override
    protected void swim(int distance) {
        System.out.println(name + " не умеет плавать");
    }

    public static int getCount() {
        return catCount;
    }
}
