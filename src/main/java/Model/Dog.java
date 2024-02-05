package Model;

import java.util.Calendar;

public class Dog extends Pet{

    public Dog(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Dog(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Dog(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public Dog(String name) {
        super(name);
    }
}
