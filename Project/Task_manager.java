package Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_manager {

    Map<String, Task> data = new HashMap<>();

    private Scanner scanner;
    public Task_manager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void CreatedTask() { 
        
        scanner.nextLine();
        System.out.print("Enter the task title: ");
        String Title = scanner.nextLine();
        
        System.out.print("\nEnter the task description: ");
        String Description = scanner.nextLine();
        
        data.put("Task", new Task(Title, Description ));
        
    }

    public void Listtask() { 
        for (Map.Entry<String, Task> entrada : data.entrySet()) { /* ENTENDER COMO FUNCIONA  */
            Task data = entrada.getValue();
            
            System.out.println("Title:" + data.getTitle());
            System.out.println("Description:" + data.getDescription());
        }
        
    }
    public void listByPriority() { }
    public void ConcludeTarefa() { }
    public void DeleteTask() { }
    public void ListByStatus() { }
}
