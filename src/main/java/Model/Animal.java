package Model;

import Service.DateHelper;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Animal {

    protected static Integer lastId = 0;
    protected Integer id;
    protected String name;
    protected Calendar birthDate;
    protected String commands;
    protected final String type = getClass().getSimpleName();

    public Animal(String name, Calendar birthDate, String commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
        this.id = ++lastId;
    }
    public Animal(String name, String birthDate, String commands) {
        this.name = name;
        this.birthDate = new DateHelper().stringToCalendar(birthDate, "yyyy-MM-dd");
        this.commands = commands;
        this.id = ++lastId;
    }

    public Animal(String name, Calendar birthDate) {
        this(name, birthDate, "");
    }

    public Animal(String name) {
        this(name, new GregorianCalendar(), "");
    }

    @Override
    public String toString() {
        return id.toString() + " | " + type + " | " + name + " | " + birthDate + " | " + commands;
    }
}
