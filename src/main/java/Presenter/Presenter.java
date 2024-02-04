package Presenter;


import Model.*;
import Service.AnimalNursery;
import View.View;

import java.util.Scanner;

public class Presenter {
    private final View view;

    public Presenter(View view) {
        this.view = view;
    }

    public void start() {
        AnimalNursery nursery = new AnimalNursery();

        boolean appRunning = true;
        String userInput;

        view.showWelcome();

        while (appRunning) {
            view.showMainMenu();
            userInput = getUserInput("Введите номер команды: ");

            switch (userInput) {
                case "1" -> nursery.generateNursery();
                case "2" -> view.showAnimalTable(nursery.getAnimals());
                case "3" -> addNewAnimal(nursery);
                case "0" -> appRunning = false;
                default -> view.showMessage("Ошибка! Команда не реализована");
            }
        }

        view.showMessage("Программа завершена");
    }

    private String getUserInput(String message) {
        Scanner in = new Scanner(System.in);
        view.showPrompt(message);
        return in.nextLine();
    }

    private void addNewAnimal(AnimalNursery nursery) {
        String name = "";
        while (name.isEmpty()) {
            name = getUserInput("Введите имя: ");
        }

        String birth = "";
        while (birth.isEmpty()) {
            birth = getUserInput("Введите дату рождения в формате YYYY-MM-DD: ");
        }

        String commands = "";
        while (commands.isEmpty()) {
            commands = getUserInput("Введите команды через запятую: ");
        }

        view.showAnimalTypesMenu();

        String animalType = "";
        while (animalType.isEmpty()) {
            animalType = getUserInput("Выберите тип животного: ");

            switch (animalType) {
                case "0" -> { return; }
                case "1" -> nursery.addAnimal(new Dog(name, birth, commands));
                case "2" -> nursery.addAnimal(new Cat(name, birth, commands));
                case "3" -> nursery.addAnimal(new Hamster(name, birth, commands));
                case "4" -> nursery.addAnimal(new Horse(name, birth, commands));
                case "5" -> nursery.addAnimal(new Camel(name, birth, commands));
                case "6" -> nursery.addAnimal(new Donkey(name, birth, commands));
                default  -> animalType = "";
            }
        }
    }
}
