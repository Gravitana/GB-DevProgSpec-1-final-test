package View;

import Model.SpeciesAnimals;

import java.util.List;

public interface View {
    void showWelcome();
    void showMainMenu();
    void showAnimalTypesMenu();
    void showPrompt(String message);
    void showMessage(String message);
    <T extends SpeciesAnimals> void showAnimal(T animal);
    <T extends SpeciesAnimals> void showAnimalTable(List<T> animals);
    void showCount();
}
