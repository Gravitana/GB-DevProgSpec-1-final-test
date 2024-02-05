package Model;

import java.util.Calendar;

public class Horse extends PackAnimal{

    public Horse(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Horse(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Horse(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public Horse(String name) {
        super(name);
    }
}
