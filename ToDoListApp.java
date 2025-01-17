import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the To-Do List Application!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Delete a task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter the task to add: ");
                    String task = sc.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("Your tasks:");
                        for (int i = 0; i < toDoList.size(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.println("Enter the task number to delete: ");
                        int taskNumber = sc.nextInt();
                        if (taskNumber > 0 && taskNumber <= toDoList.size()) {
                            toDoList.remove(taskNumber - 1);
                            System.out.println("Task deleted successfully!");
                        } else {
                            System.out.println("Invalid task number");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the To-Do List Application. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again");
            }
        }
    }
}
