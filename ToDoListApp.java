import java.util.Scanner;

public class ToDoListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Parallel arrays to store tasks and their completion status
        String[] tasks = new String[100];
        boolean[] isCompleted = new boolean[100];
        int taskCount = 0;
        
        boolean running = true;

        System.out.println("Welcome to the To-Do List App!");

        while (running) {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add a Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete a Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    if (taskCount < 100) {
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        if (!description.trim().isEmpty()) {
                            tasks[taskCount] = description;
                            isCompleted[taskCount] = false;
                            taskCount++;
                            System.out.println("Task added successfully!");
                        } else {
                            System.out.println("Task description cannot be empty.");
                        }
                    } else {
                        System.out.println("List is full! Cannot add more tasks.");
                    }
                    break;
                    
                case "2":
                    if (taskCount == 0) {
                        System.out.println("Your to-do list is empty.");
                    } else {
                        System.out.println("\n--- Your Tasks ---");
                        for (int i = 0; i < taskCount; i++) {
                            String status = isCompleted[i] ? "[X]" : "[ ]";
                            System.out.println((i + 1) + ". " + status + " " + tasks[i]);
                        }
                    }
                    break;
                    
                case "3":
                    if (taskCount == 0) {
                        System.out.println("Your to-do list is empty.");
                        break;
                    }
                    
                    System.out.println("\n--- Your Tasks ---");
                    for (int i = 0; i < taskCount; i++) {
                        String status = isCompleted[i] ? "[X]" : "[ ]";
                        System.out.println((i + 1) + ". " + status + " " + tasks[i]);
                    }
                    
                    System.out.print("Enter the task number to mark as completed: ");
                    try {
                        int taskNumber = Integer.parseInt(scanner.nextLine());
                        if (taskNumber > 0 && taskNumber <= taskCount) {
                            isCompleted[taskNumber - 1] = true;
                            System.out.println("Task marked as completed!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                    
                case "4":
                    if (taskCount == 0) {
                        System.out.println("Your to-do list is empty.");
                        break;
                    }
                    
                    System.out.println("\n--- Your Tasks ---");
                    for (int i = 0; i < taskCount; i++) {
                        String status = isCompleted[i] ? "[X]" : "[ ]";
                        System.out.println((i + 1) + ". " + status + " " + tasks[i]);
                    }
                    
                    System.out.print("Enter the task number to delete: ");
                    try {
                        int taskNumber = Integer.parseInt(scanner.nextLine());
                        if (taskNumber > 0 && taskNumber <= taskCount) {
                            // Shift elements to the left to overwrite the deleted task
                            for (int i = taskNumber - 1; i < taskCount - 1; i++) {
                                tasks[i] = tasks[i + 1];
                                isCompleted[i] = isCompleted[i + 1];
                            }
                            
                            // Clear the last element data
                            tasks[taskCount - 1] = null;
                            isCompleted[taskCount - 1] = false;
                            taskCount--;
                            
                            System.out.println("Task deleted successfully!");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                    
                case "5":
                    running = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
