package Model;

import java.util.ArrayList;

public abstract class Animal {
    protected String name;
    protected String birthDate;
    protected String commands;
    protected final String type = getClass().getSimpleName();

    public Animal(String name, String birthDate, String commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
    }
    public Animal(String name, String birthDate) {
        this(name, birthDate, "");
    }
    public Animal(String name) {
        this(name, "", "");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " | " + name + " | " + birthDate + " | " + commands;
    }
}
