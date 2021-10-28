package com.lessons.hw.lesson6;

import java.util.Random;

public class Lesson6Hw {

    private static Random random;

    public static void main(String[] args) {

//        1. Создать классы Собака и Кот с наследованием от класса Животное.
//        2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//        Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//        3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//        4. * Добавить подсчет созданных котов, собак и животных.

        random =  new Random();
        Animal[] animals = new Animal[5];
        animals[0] = new Cat("Кот Барсик");
        animals[1] =  new Cat("Кот Филя",100);
        animals[2] =  new Dog("Пес Рекс",15, 600);
        animals[3] =  new Dog("Пес Макс",5, 300);
        animals[4] =  new Dog("Пес Кекс");

        for (Animal animal : animals) {
            int runDistance = getRunDistance();
            int swimDistance = getSwimDistance();
            System.out.println("Требуется пробежать " + runDistance + "м и проплыть " + swimDistance + "м");
            animal.run(runDistance);
            animal.swim(swimDistance);
            System.out.println("--------Следующий участник--------");
        }

        System.out.println("Всего участвовало " + Animal.getCount() + " животных:" + " кошек - " + Cat.getCount() + ", собак - "+ Dog.getCount());
    }

    public static int getRunDistance() {
        return random.nextInt(650);
    }

    public static int getSwimDistance() {
        return random.nextInt(15);
    }
}