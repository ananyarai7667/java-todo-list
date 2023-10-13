import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a task");
            System.out.println("2. Display tasks");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the task: ");
                    String task = scanner.nextLine();
                    addToDoItem(toDoList, task);
                    break;
                case 2:
                    displayToDoList(toDoList);
                    break;
                case 3:
                    System.out.println("Quitting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        }
    }

    // Function to add a task to the to-do list
    private static void addToDoItem(ArrayList<String> toDoList, String task) {
        toDoList.add(task);
        System.out.println("Task '" + task + "' added to the to-do list.");
    }

    // Function to display the tasks in the to-do list
    private static void displayToDoList(ArrayList<String> toDoList) {
        if (toDoList.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("Tasks in the to-do list:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }
}
