package Model;

import java.util.Calendar;

public class Donkey extends PackAnimal{

    public Donkey(String name, Calendar birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Donkey(String name, String birthDate, String commands) {
        super(name, birthDate, commands);
    }

    public Donkey(String name, Calendar birthDate) {
        super(name, birthDate);
    }

    public Donkey(String name) {
        super(name);
    }
}
