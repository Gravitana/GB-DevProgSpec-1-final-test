package Model;

import java.util.Calendar;

public interface SpeciesAnimals {

    Integer getId();

    String getName();

    Calendar getBirthDate();

    String getStringBirthDate();

    String getCommands();

    String getType();

    String getSpecies();

    void setCommands(String commands);
}
