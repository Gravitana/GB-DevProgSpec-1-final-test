package Presenter;


import Data.DataSeeder;
import Model.*;
import View.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Presenter {
    private final View view;

    public Presenter(View view) {
        this.view = view;
    }

    public void start() {
        List<SpeciesAnimals> animals = new ArrayList<>();
        boolean appRunning = true;
        String userInput;

        view.showWelcome();

//        String userInput = getUserInput("Заполнить реестр готовым списком животных? (д/н)");
//        if (userInput.equals("y") || userInput.equals("д")) {
//            animals = new DataSeeder().getAnimals();
//        } else {
//            animals = new ArrayList<>();
//        }

        while (appRunning) {
            view.showMainMenu();
            userInput = getUserInput("Введите номер команды: ");

            switch (userInput) {
                case "1" -> animals = new DataSeeder().getAnimals();
                case "2" -> view.showAnimalTable(animals);
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
}
