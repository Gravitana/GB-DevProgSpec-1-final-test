package Service;

import Data.DataSeeder;
import Model.SpeciesAnimals;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

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

    public List<SpeciesAnimals> getAnimalsByYear(String str) {
        List<SpeciesAnimals> animals = new ArrayList<>();
        String year;
        if (!nursery.isEmpty()) {
            for (SpeciesAnimals animal : nursery) {
                year = "" + animal.getBirthDate().get(Calendar.YEAR);

                if (year.equals(str)) {
                     animals.add(animal);
                }
            }
        }
        return animals;
    }
}
