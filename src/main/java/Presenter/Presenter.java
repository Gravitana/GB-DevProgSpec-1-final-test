package Presenter;


import Model.*;
import Service.AnimalNursery;
import Service.DateHelper;
import View.View;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
                case "4" -> addNewCommand(nursery);
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

        Calendar birthDate = GregorianCalendar.getInstance();
        String birth = "";
        DateHelper dt = new DateHelper();
        while (birth.isEmpty()) {
            String dateFormat = "yyyy-MM-dd";
            birth = getUserInput("Введите дату рождения в формате " + dateFormat + ": ");
            birthDate = dt.stringToCalendar(birth, dateFormat);

            if (birthDate == null) {
                view.showMessage("Ошибка! Введена некорректная дата.");
                birth = "";
            }
        }

        String commands = "";
        while (commands.isEmpty()) {
            commands = getUserInput("Введите команды через запятую: ");
        }

        view.showAnimalTypesMenu();

        SpeciesAnimals animal = null;
        String animalType = "";
        while (animalType.isEmpty()) {
            animalType = getUserInput("Выберите тип животного: ");

            switch (animalType) {
                case "0" -> { return; }
                case "1" -> animal = new Dog(name, birthDate, commands);
                case "2" -> animal = new Cat(name, birthDate, commands);
                case "3" -> animal = new Hamster(name, birthDate, commands);
                case "4" -> animal = new Horse(name, birthDate, commands);
                case "5" -> animal = new Camel(name, birthDate, commands);
                case "6" -> animal = new Donkey(name, birthDate, commands);
                default  -> animalType = "";
            }
        }
        nursery.addAnimal(animal);
        view.showMessage("Животное добавлено");
        view.showAnimal(animal);
    }

    private void addNewCommand(AnimalNursery nursery) {
        view.showAnimalTable(nursery.getAnimals());
        if (nursery.getAnimals().isEmpty()) {
            view.showMessage("Ошибка! В питомнике нет животных.");
            return;
        }

        String userInput = getUserInput("Введите id животного или 0 для отмены: ");
        int id = Integer.parseInt(userInput);
        if (id <= 0) {
            return;
        }

        SpeciesAnimals animal = nursery.getAnimalById(id);
        if (animal != null) {
            view.showAnimal(animal);

            String commands = "";
            while (commands.isEmpty()) {
                commands = getUserInput("Введите новые команды через запятую: ");
            }

            commands = animal.getCommands() + ", " + commands;
            animal.setCommands(commands);
            view.showAnimal(animal);
        } else {
            view.showMessage("Ошибка! Животное с id=" + id + " не найдено.");
        }
    }
}
