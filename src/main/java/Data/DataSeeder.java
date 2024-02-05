package Data;

import Model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class DataSeeder {
    public ArrayList<SpeciesAnimals> getAnimals(){
        return new ArrayList<>(Arrays.asList(
                new Dog("Fido", "2020-01-01", "Sit, Stay, Fetch"),
                new Cat("Whiskers", "2019-05-15", "Sit, Pounce"),
                new Hamster("Hammy", "2021-03-10", "Roll, Hide"),
                new Dog("Buddy", "2018-12-10", "Sit, Paw, Bark"),
                new Cat("Smudge", "2020-02-20", "Sit, Pounce, Scratch"),
                new Hamster("Peanut", "2021-08-01", "Roll, Spin"),
                new Dog("Bella", "2019-11-11", "Sit, Stay, Roll"),
                new Cat("Oliver", "2020-06-30", "Meow, Scratch, Jump"),

//                new Horse("Thunder", "2015-07-21", "Trot, Canter, Gallop"),
//                new Camel("Sandy", "2016-11-03", "Walk, Carry Load"),
//                new Donkey("Eeyore", "2017-09-18", "Walk, Carry Load, Bray"),
                new Horse("Storm", "2014-05-05", "Trot, Canter"),
                new Camel("Dune", "2018-12-12", "Walk, Sit"),
                new Donkey("Burro", "2019-01-23", "Walk, Bray, Kick"),
                new Horse("Blaze", "2016-02-29", "Trot, Jump, Gallop"),
                new Camel("Sahara", "2015-08-14", "Walk, Run")
        ));
    }
}
