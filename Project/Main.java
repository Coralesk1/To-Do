package Project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        Task_manager manager = new Task_manager(scanner); 
       
        boolean returnMenu = false;
        while (!returnMenu) {

            System.out.println("1 - Created");
            System.out.println("2 - list task");
            System.out.println("3 - Exit the system");
            System.out.print("Choose one of the options: ");
            int options = scanner.nextInt();
            
            switch (options) {
                case 1:
                    manager.CreatedTask();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 2:
                    manager.Listtask();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 3:
                    returnMenu = true;
                    break;
                default:
                    System.out.println("Error, please choose a valid option.");
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    clearScreen();
                    break;
            
            }
            
        }
        scanner.close();
    }

    public static void clearScreen(){
        for(int i = 1; i < 50; i++){
            System.out.println();
        }
    }
}