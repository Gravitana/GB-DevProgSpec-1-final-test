package Model;

import java.util.Calendar;

public class Camel extends PackAnimal{

    public Camel(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Camel(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Camel(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public Camel(String name) {
        super(name);
    }
}
