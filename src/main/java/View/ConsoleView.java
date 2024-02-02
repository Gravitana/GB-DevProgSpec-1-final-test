package View;

import Model.Animal;

import java.util.List;

public class ConsoleView implements View{
    @Override
    public void showWelcome() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                                                          ║");
        System.out.println("║                   П И Т О М Н И К     Ж И В О Т Н Ы Х                    ║");
        System.out.println("║                                                                          ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════╝");
    }

    @Override
    public void showPrompt(String message) {
        System.out.printf(" %32s ", message);
    }

    @Override
    public void showMessage(String message) {
        System.out.println("╔═══════════════════════════════════════╗");
        System.out.printf( "║ %-37s ║\n", message);
        System.out.println("╚═══════════════════════════════════════╝");
    }

    @Override
    public void showAnimalTable(List<Animal> animals) {
        this.showAnimalTableHeader();
        for (Animal animal : animals) {
            this.showAnimalTableRow(animal);
        }
        this.showAnimalTableFooter();
    }

    private void showAnimalTableHeader() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════╗");
        System.out.print("║");
        System.out.printf( " %-12s ", "TYPE");
        System.out.printf( " %-12s ", "NAME");
        System.out.printf( " %-12s ", "BIRTHDATE");
        System.out.printf( " %-30s ", "COMMANDS");
        System.out.println( "║");
        System.out.println("║                                                                          ║");
    }
    private void showAnimalTableRow(Animal animal) {
        System.out.print("║");
        System.out.printf(" %-12s ", animal.getType());
        System.out.printf(" %-12s ", animal.getName());
        System.out.printf(" %-12s ", animal.getBirthDate());
        System.out.printf(" %-30s ", animal.getCommands());
        System.out.println("║");
    }
    private void showAnimalTableFooter() {
        System.out.println("╚══════════════════════════════════════════════════════════════════════════╝");
    }
}
