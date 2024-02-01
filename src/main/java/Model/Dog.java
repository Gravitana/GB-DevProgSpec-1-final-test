package Model;

public class Dog extends Pet{
    public Dog(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Dog(String name, String birthDate) {
        super(name, birthDate);
    }

    public Dog(String name) {
        super(name);
    }
}
