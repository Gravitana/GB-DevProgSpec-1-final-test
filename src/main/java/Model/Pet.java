package Model;

import Service.DateHelper;

import java.util.Calendar;

public abstract class Pet extends Animal implements SpeciesAnimals {

    final String specie = "Pet";
    private static int countAnimals = 0;

    public Pet(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
        ++countAnimals;
    }

    public Pet(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
        ++countAnimals;
    }

    public Pet(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public Pet(String name) {
        super(name);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getStringBirthDate() {
        return new DateHelper().calendarToString(birthDate);
    }

    public String getCommands() {
        return commands;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getSpecies() {
        return this.specie;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public static int getCount() {
        return countAnimals;
    }

    @Override
    public String toString() {
        return specie + " | " + type + " | " + name + " | " + birthDate + " | " + commands;
    }
}
