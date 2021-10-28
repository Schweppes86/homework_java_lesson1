package com.lessons.hw.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food=food;
    }

    public void info() {
        System.out.println("Plate:" + food);
    }

    public void decreaseFood(int foodCount) {
        this.food -= foodCount;
    }

    //6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    public void increaseFood(int foodCount) {
        this.food += foodCount;
    }

    public boolean checkPlate(int appetite) {
        return food >= appetite;
    }
}
