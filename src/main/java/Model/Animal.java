package Model;

public abstract class Animal {

    protected static Integer lastId = 0;
    protected Integer id;
    protected String name;
    protected String birthDate;
    protected String commands;
    protected final String type = getClass().getSimpleName();

    public Animal(String name, String birthDate, String commands) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = commands;
        this.id = ++lastId;
    }

    public Animal(String name, String birthDate) {
        this(name, birthDate, "");
    }

    public Animal(String name) {
        this(name, "", "");
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCommands() {
        return commands;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return id.toString() + " | " + type + " | " + name + " | " + birthDate + " | " + commands;
    }
}
