package com.lessons.hw.lesson7;

public class Cat {
    private final int appetite;
    private final String name;
    private boolean fullness;

    public Cat (String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
        this.fullness = false;
    }

    public int getAppetite() {
        return appetite;
    }

    //2. Сделать так, чтобы в тарелке с едой не могло получиться
    // отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).

    public void eat(Plate plate) {
        if (plate.checkPlate(appetite)) {
            System.out.println("Cat has eaten");
            plate.decreaseFood(appetite);
            setFullness(true);
        }
        else {
            System.out.println("Not enough food on the plate");
        }
    }

    //3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
    // Если коту удалось покушать (хватило еды), сытость = true.

    private void setFullness(boolean fullness) {
        this.fullness = fullness;
    }

    public boolean getFullness() {
        return fullness;
    }

    public void checkCatFullness() {
        if (fullness) {
            System.out.println(name + " is full ");
        }
        else {
            System.out.println(name + " is hungry");
        }
    }
}
