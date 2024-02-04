package Service;

import Data.DataSeeder;
import Model.SpeciesAnimals;

import java.util.ArrayList;

public class AnimalNursery {
    private ArrayList<SpeciesAnimals> nursery = new ArrayList<>();

    public void generateNursery() {
        nursery = new DataSeeder().getAnimals();
    }
    public ArrayList<SpeciesAnimals> getAnimals() {
        return nursery;
    }
    public void addAnimal(SpeciesAnimals animal) {
        nursery.add(animal);
    }

    public SpeciesAnimals getAnimalById(int id) {
        if (!nursery.isEmpty()) {
            for (SpeciesAnimals animal : nursery) {
                if (animal.getId() == id) {
                    return animal;
                }
            }
        }
        return null;
    }
}
