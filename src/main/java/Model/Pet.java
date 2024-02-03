package Model;

public abstract class Pet extends Animal implements SpeciesAnimals {

    final String specie = "Pet";

    public Pet(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Pet(String name, String birthDate) {
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

    public String getBirthDate() {
        return birthDate;
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
    @Override
    public String toString() {
        return specie + " | " + type + " | " + name + " | " + birthDate + " | " + commands;
    }
}
