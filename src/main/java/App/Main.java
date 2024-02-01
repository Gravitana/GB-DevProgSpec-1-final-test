package App;

import Data.DataSeeder;
import Model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new DataSeeder().getAnimals();

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
