package Model;

import Service.DateHelper;

import java.util.Calendar;

public abstract class PackAnimal extends Animal implements SpeciesAnimals {

    final String specie = "PackAnimal";
    private static int countAnimals = 0;

    public PackAnimal(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
        ++countAnimals;
    }

    public PackAnimal(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
        ++countAnimals;
    }

    public PackAnimal(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public PackAnimal(String name) {
        super(name);
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Calendar getBirthDate() {
        return birthDate;
    }

    public String getStringBirthDate() {
        return new DateHelper().calendarToString(birthDate);
    }

    @Override
    public String getCommands() {
        return commands;
    }

    @Override
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
