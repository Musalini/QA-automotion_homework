import Animal.Animal;
import Animal.Pets.Cat;
import Animal.Pets.Dog;
import Animal.Birds.Duck;
import Animal.data.Command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Animal> animalList = new ArrayList<>();
        showCommand();
        while (true) {
            switch (Command.valueOf(reader.readLine().toUpperCase().trim())) {
                case ADD -> {
                    System.out.println("Какое животное вы хотите добавить (cat/dog/duck)?");
                    switch (reader.readLine()) {
                        case "cat" -> addAnimal(new Cat(), animalList, reader);
                        case "dog" -> addAnimal(new Dog(), animalList, reader);
                        case "duck" -> addAnimal(new Duck(), animalList, reader);
                        default -> System.out.println("Некорректное название животного!");
                    }
                }
                case LIST -> {
                    for (Animal list : animalList) {
                        System.out.println(list.toString());
                    }
                    showCommand();
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    static void showCommand() {
        System.out.println("-----------------------------------");
        System.out.println("Введите команду: ");
        System.out.println("add - добавить животное в список ");
        System.out.println("list - вывести список животных ");
        System.out.println("exit - выйти из программы ");
    }

    static void informationInput(Animal animal, BufferedReader reader) throws IOException {
        System.out.println("Укажите имя: ");
        animal.setName(reader.readLine());
        System.out.println("Укажите возраст: ");
        animal.setAge(Integer.parseInt(reader.readLine()));
        System.out.println("Укажите вес: ");
        animal.setWeight(Integer.parseInt(reader.readLine()));
        System.out.println("Укажите цвет: ");
        animal.setColor(reader.readLine());
    }

    static void addAnimal(Animal animal, ArrayList<Animal> animalList, BufferedReader reader) throws IOException {
        informationInput(animal, reader);
        animalList.add(animal);
        animal.say();
        showCommand();
    }
}
