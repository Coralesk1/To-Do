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
        
        
        System.out.print("Enter the task title: ");
        String Title = scanner.nextLine();
        
        System.out.print("\nEnter the task description: ");
        String Description = scanner.nextLine();

        System.out.print("[1] - High\n[2] - Medium\n[3] - Low\nEnter the task priority:");
        int Priority = scanner.nextInt();
        
        data.put(Id++, new Task(Title, Description, Priority, false));
        
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
                PriorityCondition(data); 
                System.out.println("Title: " + data.getTitle());
                System.out.println("Description: " + data.getDescription());
            });
    }

    public void CompleteTask() {
        
        System.out.println("Enter the id of the task you want to complete: ");
        int Id = scanner.nextInt();
        scanner.nextLine();
        if (data.containsKey(Id)) {
            Task task = data.get(Id); 

            System.out.println("Task Id: " + Id);
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed:" + task.getCompleted());

            System.out.println("Do you want to mark or unmark a task? [m/u]");
            String mu = scanner.nextLine();
            if(mu.equalsIgnoreCase("m")){
                task.setCompleted(true); 
                System.out.println("Task marked as completed!");
            }
            else if(mu.equalsIgnoreCase("u")){
                task.setUnmark(false);
                System.out.println("Unchecked task!");
            }      
            else{
                System.out.println("Invalid!");
            }

        } else { 
        System.out.println("Error: Task with that ID not found.");
        }
}

    public void DeleteTask() { 
        System.out.println("Enter the id of the task you want to delete: ");
        int idremove = scanner.nextInt();
        scanner.nextLine();
        
        if (data.containsKey(idremove)){
            data.remove(idremove);
            System.out.println("certo");
        }
        else{
            System.out.println("Id does not exist");
        }      
    }

    public void ListByComplete() { 
        System.out.println("List by complete or incomplete? [c/i]: ");
        String ci = scanner.nextLine();

        for (Map.Entry<Integer, Task> entry : data.entrySet()) {
            Task task = entry.getValue();
            if ((ci.equals("c")) && (task.getCompleted())) {
                System.out.println("----------------------------");
                System.out.println("Id: " + entry.getKey());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Completed: "+ task.getCompleted());
            } 
            else if ((ci.equals("i")) && (!task.getCompleted())){
                System.out.println("----------------------------");
                System.out.println("Id: " + entry.getKey());
                System.out.println("Title: " + task.getTitle());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Completed: "+ task.getCompleted());
            }
        }
    }

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
