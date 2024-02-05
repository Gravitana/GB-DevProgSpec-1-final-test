package Model;

import java.util.Calendar;

public class Cat extends Pet{

    public Cat(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Cat(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Cat(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public Cat(String name) {
        super(name);
    }
}
