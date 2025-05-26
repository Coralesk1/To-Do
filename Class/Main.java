package Class;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o titulo: ");
        
        Map<String, Integer> TaskData = new HashMap<>();
        
        Task_manager manager = new Task_manager(scanner);
        manager.CreatedTask();

        
        //adicionando pares de chaves-valor
   









        scanner.close();
    }
}