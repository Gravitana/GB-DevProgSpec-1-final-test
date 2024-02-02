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
    public void showMainMenu() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║ 1 - Показать весь список                      ║");
        System.out.println("║ 2 - Добавить животное                         ║");
        System.out.println("║ 3 - Редактировать животное                    ║");
        System.out.println("║ 4 - Удалить животное                          ║");
        System.out.println("║ 5 - Найти животное по имени                   ║");
        System.out.println("║                                               ║");
        System.out.println("║ 0 - Выйти из программы                        ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
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
        if (!animals.isEmpty()) {
            for (Animal animal : animals) {
                this.showAnimalTableRow(animal);
            }
        } else {
            System.out.println("║                                    Нет данных                                    ║");
        }
        this.showAnimalTableFooter();
    }

    private void showAnimalTableHeader() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════════╗");
        System.out.print("║");
        System.out.printf( " %6s ", "ID");
        System.out.printf( " %-12s ", "Type");
        System.out.printf( " %-12s ", "Name");
        System.out.printf( " %-12s ", "BirthDate");
        System.out.printf( " %-30s ", "Commands");
        System.out.println( "║");
        System.out.println("║                                                                                  ║");
    }
    private void showAnimalTableRow(Animal animal) {
        System.out.print("║");
        System.out.printf(" %6d ", animal.getId());
        System.out.printf(" %-12s ", animal.getType());
        System.out.printf(" %-12s ", animal.getName());
        System.out.printf(" %-12s ", animal.getBirthDate());
        System.out.printf(" %-30s ", animal.getCommands());
        System.out.println("║");
    }
    private void showAnimalTableFooter() {
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════════╝");
    }
}
