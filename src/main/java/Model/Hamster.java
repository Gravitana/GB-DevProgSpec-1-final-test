package Model;

public class Hamster extends Pet{
    public Hamster(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Hamster(String name, String birthDate) {
        super(name, birthDate);
    }

    public Hamster(String name) {
        super(name);
    }
}
