package com.lessons.hw.lesson7;

public class Lesson7Hw {
    public static void main(String[] args) {

        //4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
        // то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

        //5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
        // и потом вывести информацию о сытости котов в консоль.

        Cat[] cats = getCats();
        Plate plate = new Plate(10);

        eat(cats, plate);
        checkCatsFullness(cats);
    }

    private static void eat(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
        }
    }

    private static void checkCatsFullness(Cat[] cats) {
        System.out.println("----Information about cat's fullness----");
        for (Cat cat : cats) {
            cat.checkCatFullness();
        }
    }

    private static Cat[] getCats() {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik",1);
        cats[1] = new Cat("Murzik",2);
        cats[2] = new Cat("Felix",10);
        cats[3] = new Cat("Markiz",4);
        cats[4] = new Cat("Stepan",22);
        return cats;
    }

}
