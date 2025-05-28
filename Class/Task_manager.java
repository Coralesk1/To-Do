package Class;

import java.util.Scanner;

public class Task_manager {
    private Scanner scanner;

    public Task_manager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void CreatedTask() { 
        System.out.println("Enter the task title: ");
        String Title = scanner.nextLine();
        System.out.println("Enter the task description: ");
        String Description = scanner.nextLine();
        Task Task_class = new Task(Title, Description );
        
        System.out.println(Task_class);
    }

    // os outros métodos também podem usar `scanner`
    public void Listtask() { }
    public void listByPriority() { }
    public void ConcludeTarefa() { }
    public void DeleteTask() { }
    public void ListByStatus() { }
}
