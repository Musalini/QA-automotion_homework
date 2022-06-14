package com.company;

public class Animal {
    private String name;
    private int age;
    private int weight;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String showAgeInfo(int age) {
        if (age == 1)
            return ", мне " + age + " год";
        else if (age > 1 && age < 5)
            return ", мне " + age + " года";
        else
            return ", мне " + age + " лет";
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
        else System.out.println("Некорректное значение возраста!");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void say() {
        System.out.println("Я говорю!");
    }

    void go() {
        System.out.println("Я иду!");
    }

    void drink() {
        System.out.println("Я пью!");
    }

    void eat() {
        System.out.println("Я ем!");
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + getName() +
                showAgeInfo(getAge()) +
                ", я вешу - " + getWeight() + " кг" +
                ", мой цвет - " + getColor() + "!";
    }
}
