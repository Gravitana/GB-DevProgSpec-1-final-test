package Model;

public abstract class Pet extends Animal implements Species {

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

    @Override
    public String getSpecies() {
        return this.specie;
    }
    @Override
    public String toString() {
        return specie + " | " + type + " | " + name + " | " + birthDate + " | " + commands;
    }
}
