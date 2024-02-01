package Model;

public class Horse extends PackAnimal{
    public Horse(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Horse(String name, String birthDate) {
        super(name, birthDate);
    }

    public Horse(String name) {
        super(name);
    }
}
