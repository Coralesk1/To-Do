package Project;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_manager {

    Map<Integer, Task> data = new HashMap<>();
    int id = 1;

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

        System.out.print("[1] - High\n[2] - Medium\n[3] - Low\nEnter the task priority:");
        int Priority = scanner.nextInt();


        
        data.put(id++, new Task(Title, Description, Priority)); /* faz um metodo pra marca a tarefa por id e quando for listar as tarefas tem que aparecer as que ja estão completas */
        
    }

    public void Listtask() { 
        for (Map.Entry<Integer, Task> entrada : data.entrySet()) { 
            Task data = entrada.getValue();
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("Task Id: "+ entrada.getKey());
            System.out.println("Title: " + data.getTitle());
            System.out.println("Description: " + data.getDescription());
            if(data.getPriority() == 1){
                    System.out.println("Priority: HIGH");
                }
                else if(data.getPriority() == 2){
                    System.out.println("Priority: MEDIUM");
                }
                else if(data.getPriority() == 3){
                    System.out.println("Priority: LOW");
                }
        }
        
    }
    public void listByPriority() { 
        data.entrySet()
            .stream()
            .sorted(Comparator.comparing(entry -> entry.getValue().getPriority()))
            .forEach(entry -> {
                Task data = entry.getValue();
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                if(data.getPriority() == 1){
                    System.out.println("Priority: HIGH");
                }
                else if(data.getPriority() == 2){
                    System.out.println("Priority: MEDIUM");
                }
                else if(data.getPriority() == 3){
                    System.out.println("Priority: LOW");
                }
                System.out.println("Title: " + data.getTitle());
                System.out.println("Description: " + data.getDescription());
            });
            

    }
    public void ConcludeTask() { 
        System.out.println("Enter the id of the task you want to complete: ");
    }
    public void DeleteTask() { }
    public void ListByStatus() { }
}
