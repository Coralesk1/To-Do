package Project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        Task_manager manager = new Task_manager(scanner); 
       
        boolean returnMenu = false;

        while (!returnMenu) {
            System.out.println("1 - Created");
            System.out.println("2 - List task");
            System.out.println("3 - List by priority");
            System.out.println("4 - Complete Task");
            System.out.println("5 - List by Complete");
            System.out.println("6 - Delete Task");
            System.out.println("7 - Exit the system");
            System.out.print("Choose one of the options: ");

            int options = scanner.nextInt();
            scanner.nextLine();

            switch (options) {
                case 1:
                    clearScreen();
                    manager.CreatedTask();
                    scanner.nextLine();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 2:
                    clearScreen();
                    manager.Listtask();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 3:
                    clearScreen();
                    manager.listByPriority();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 4:
                    clearScreen();
                    manager.CompleteTask();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 5:
                    clearScreen();
                    manager.ListByComplete();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 6:
                    clearScreen();
                    manager.DeleteTask();
                    System.out.println("Press enter to return to the menu");
                    scanner.nextLine();
                    clearScreen();
                    break;
                case 7:
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