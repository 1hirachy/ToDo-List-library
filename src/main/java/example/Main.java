package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. List All Tasks");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: {
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    System.out.println("Task added.");
                    break;
                }
                case 2: {
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    toDoList.removeTask(removeIndex);
                    break;
                }
                case 3: {
                    System.out.print("Enter task index to mark as complete: ");
                    int completeIndex = scanner.nextInt();
                    toDoList.markTaskAsComplete(completeIndex);
                    break;
                }
                case 4: {
                    System.out.println("Current To-Do List:");
                    toDoList.listTasks();
                    break;
                }
                case 5: {
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }
    }
}