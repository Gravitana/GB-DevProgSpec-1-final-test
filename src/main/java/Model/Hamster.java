package Model;

import java.util.Calendar;

public class Hamster extends Pet{

    public Hamster(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Hamster(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Hamster(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public Hamster(String name) {
        super(name);
    }
}
