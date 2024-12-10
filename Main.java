import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;

        System.out.println("Welcome to To-Do List App!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Enter task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added!");
                    break;

                case 2: 
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found!");
                    } else {
                        System.out.println("\nYour Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3: 
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete!");
                    } else {
                        System.out.print("Enter task number to delete: ");
                        int taskNo = scanner.nextInt();
                        if (taskNo > 0 && taskNo <= tasks.size()) {
                            tasks.remove(taskNo - 1);
                            System.out.println("Task deleted!");
                        } else {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;

                case 4: 
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
