package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Animal> animalList = new ArrayList<>();
        showCommand();
        boolean flagToExit = true;
        while (flagToExit) {
            switch (Command.valueOf(reader.readLine().toUpperCase().trim())) {
                case ADD:
                    System.out.println("Какое животное вы хотите добавить (cat/dog/duck)?");
                    switch (reader.readLine()) {
                        case "cat":
                            Cat cat = new Cat();
                            System.out.println("Укажите имя: ");
                            cat.setName(reader.readLine());
                            System.out.println("Укажите возраст: ");
                            cat.setAge(Integer.parseInt(reader.readLine()));
                            System.out.println("Укажите вес: ");
                            cat.setWeight(Integer.parseInt(reader.readLine()));
                            System.out.println("Укажите цвет: ");
                            cat.setColor(reader.readLine());
                            animalList.add(cat);
                            cat.say();
                            showCommand();
                            break;
                        case "dog":
                            Dog dog = new Dog();
                            System.out.println("Укажите имя: ");
                            dog.setName(reader.readLine());
                            System.out.println("Укажите возраст: ");
                            dog.setAge(Integer.parseInt(reader.readLine()));
                            System.out.println("Укажите вес: ");
                            dog.setWeight(Integer.parseInt(reader.readLine()));
                            System.out.println("Укажите цвет: ");
                            dog.setColor(reader.readLine());
                            animalList.add(dog);
                            dog.say();
                            showCommand();
                            break;
                        case "duck":
                            Duck duck = new Duck();
                            System.out.println("Укажите имя: ");
                            duck.setName(reader.readLine());
                            System.out.println("Укажите возраст: ");
                            duck.setAge(Integer.parseInt(reader.readLine()));
                            System.out.println("Укажите вес: ");
                            duck.setWeight(Integer.parseInt(reader.readLine()));
                            System.out.println("Укажите цвет: ");
                            duck.setColor(reader.readLine());
                            animalList.add(duck);
                            duck.say();
                            showCommand();
                            break;
                        default:
                            System.out.println("Некорректное название животного!");
                    }
                    break;
                case LIST:
                    for (Animal list : animalList) {
                        System.out.println(list.toString());
                    }
                    showCommand();
                    break;
                case EXIT:
                    flagToExit = false;
                    break;
            }
        }
    }

    static void showCommand() {
        System.out.println("Введите команду: ");
        System.out.println("add - добавить животное в список ");
        System.out.println("list - вывести список животных ");
        System.out.println("exit - выйти из программы ");
    }
}
