package Class;

import java.util.Scanner;

public class Task_manager {
    private Scanner scanner;

    public Task_manager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void CreatedTask() { 
        System.out.println("Title : ");
        String Title = scanner.nextLine();

        System.out.println("Título: " + Title);
    }

    // os outros métodos também podem usar `scanner`
    public void Listtask() { }
    public void listByPriority() { }
    public void ConcludeTarefa() { }
    public void DeleteTask() { }
    public void ListByStatus() { }
}
