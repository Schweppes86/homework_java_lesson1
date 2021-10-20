package com.lessons.hw;

public class Employee {
    private String full_name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee (String full_name, String position, String email, String phone, int salary, int age) {
        this.full_name = full_name;
        this.email = email;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    private String getFullName() {
       return full_name;
    }

    private String getEmail() {
        return email;
    }

    private String getPosition() {
        return position;
    }

    private String getPhone() {
        return phone;
    }

    private int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("ФИО: " + getFullName() + ", Должность: " + getPosition() + ", Емейл: "
                + getEmail() + ", Телефон: " + getPhone() + ", Зарплата: " + getSalary() + ", Возраст: " + getAge());
    }
}
