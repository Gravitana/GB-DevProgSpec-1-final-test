package Model;

public abstract class PackAnimal extends Animal implements Species {

    final String specie = "PackAnimal";

    public PackAnimal(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public PackAnimal(String name, String birthDate) {
        super(name, birthDate);
    }

    public PackAnimal(String name) {
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
