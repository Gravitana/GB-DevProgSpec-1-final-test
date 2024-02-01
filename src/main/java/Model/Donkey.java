package Model;

public class Donkey extends PackAnimal{
    public Donkey(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Donkey(String name, String birthDate) {
        super(name, birthDate);
    }

    public Donkey(String name) {
        super(name);
    }
}
