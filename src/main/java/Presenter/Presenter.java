package Presenter;


import Data.DataSeeder;
import Model.*;
import View.View;

import java.util.List;
import java.util.Scanner;

public class Presenter {
    private final View view;

    public Presenter(View view) {
        this.view = view;
    }

    public void start() {
        view.showWelcome();

        List<Animal> animals = new DataSeeder().getAnimals();

        view.showAnimalTable(animals);

        view.showMessage("Программа завершена");
    }

    private String getUserInput(String message) {
        Scanner in = new Scanner(System.in);
        view.showPrompt(message);
        return in.nextLine();
    }
}
