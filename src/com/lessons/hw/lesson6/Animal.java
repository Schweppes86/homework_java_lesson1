package com.lessons.hw.lesson6;

public abstract class Animal {

    protected String name;
    protected int maxSwimDistance;
    protected int maxRunDistance;

    public static int animalCount = 0;

    public Animal(String name, int maxSwimDistance, int maxRunDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalCount++;
    }

    protected void run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.println(name + " пробежал " + distance + "м");
        }
        else {
            System.out.println(name + " может пробежать максимум " + this.maxRunDistance + "м");
        }
    }

    protected void swim(int distance) {
        if (distance > this.maxSwimDistance) {
            System.out.println(name + " может проплыть максимум " + this.maxSwimDistance + "м");
        }
        else {
            System.out.println(name + " проплыл " + distance + "м");
        }
    }

    public static int getCount() {
        return animalCount;
    }
}
