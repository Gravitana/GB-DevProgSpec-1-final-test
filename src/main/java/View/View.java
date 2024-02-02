package View;

import Model.Animal;

import java.util.List;

public interface View {
    void showWelcome();
    void showMainMenu();
    void showPrompt(String message);
    void showMessage(String message);
    void showAnimalTable(List<Animal> animals);
}
