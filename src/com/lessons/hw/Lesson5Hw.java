package com.lessons.hw;

public class Lesson5Hw {
    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    // 2. Конструктор класса должен заполнять эти поля при создании объекта.
    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.

    public static void main(String[] args) {
        // 4. Создать массив из 5 сотрудников.
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivanov Ivan","Engineer","ivivan@mailbox.com","892312312", 30000, 30);
        employee[1] = new Employee("Petrov Petr","QA","petro@mailbox.com","89991112233", 20000, 20);
        employee[2] = new Employee("Sidorov Sidr","CTO","cto@mailbox.com","89778887788", 80000, 40);
        employee[3] = new Employee("Suvorova Valya","Accountant","salary@mailbox.com","89554443344", 60000, 45);
        employee[4] = new Employee("Borodach Vasya","Security","security@mailbox.com","89112223344", 10000, 50);

        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i=0; i < employee.length; i++) {
            if (employee[i].getAge() >= 40) {
                System.out.println("===== Сотрудник #"+ i +" ======");
                employee[i].getInfo();
            }
        }

    }
}