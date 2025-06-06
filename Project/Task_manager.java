package Project;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_manager {

    Map<Integer, Task> data = new HashMap<>();
    int Id = 1;

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

        System.out.print("Completed [False/True]: ");
        String Completed = scanner.nextLine();

        data.put(Id++, new Task(Title, Description, Priority, Completed));
        
    }

    public void Listtask() { 
        for (Map.Entry<Integer, Task> Tasks : data.entrySet()) { 
            Task data = Tasks.getValue();
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("Task Id: "+ Tasks.getKey());
            System.out.println("Title: " + data.getTitle());
            System.out.println("Description: " + data.getDescription());
            System.out.println("Completed: " + data.getCompleted());
            PriorityCondition(data);
        }
        
    }
    public void listByPriority() { 
        data.entrySet()
            .stream()
            .sorted(Comparator.comparing(entry -> entry.getValue().getPriority()))
            .forEach(entry -> {
                Task data = entry.getValue();
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                PriorityCondition(data); /* FAZ FUNCIONAR A FUNÇÃO DA CONDIÇÃO DA PRIORIDADE */
                System.out.println("Title: " + data.getTitle());
                System.out.println("Description: " + data.getDescription());
            });
            

    }
    public void CompleteTask() {
        System.out.println("Enter the id of the task you want to complete: ");
        int Id = scanner.nextInt();

        if (data.containsKey(Id)) {
            Task task = data.get(Id);
            System.out.println("Task Id: " + Id);
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
        } else {
        System.out.println("Erro: tarefa com esse ID não encontrada.");
        }
}

    public void DeleteTask() { }
    public void ListByStatus() { }
    public void PriorityCondition(Task data){
        int priority = data.getPriority();
        if(priority == 1){
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
