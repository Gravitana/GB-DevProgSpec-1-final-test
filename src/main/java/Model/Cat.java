package Model;

public class Cat extends Pet{
    public Cat(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Cat(String name, String birthDate) {
        super(name, birthDate);
    }

    public Cat(String name) {
        super(name);
    }
}
