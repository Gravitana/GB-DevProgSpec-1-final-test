package Model;

public abstract class PackAnimal extends Animal implements SpeciesAnimals {

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
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
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

    @Override
    public String toString() {
        return specie + " | " + type + " | " + name + " | " + birthDate + " | " + commands;
    }

}
