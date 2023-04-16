import java.util.ArrayList;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    ArrayList<Task> taskList = new ArrayList<Task>();
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("\nCommand list:\n1 - add task\n2 - see the list of tasks\n" +
            "3 - mark the task as completed\n4 - edit the task\n" +
            "5 - delete task\n6 - exit");
        System.out.println("Enter the team number:");
        int command = scanner.nextInt();
        scanner.nextLine();

        switch (command) {
          case 1:
            System.out.println("Enter the content of the task:");
            String description = scanner.nextLine();
            Task newTask = new Task(description);
            taskList.add(newTask);
            System.out.println("Task added!");
            break;
          case 2:
            System.out.println("List of tasks:");
            for (int i = 0; i < taskList.size(); i++) {
              System.out.println((i + 1) + ". " + taskList.get(i).getDescription());
            }
            break;
          case 3:
            System.out.println("Enter the number of the task to be marked as completed:");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();
            if (taskNumber < 1 || taskNumber > taskList.size()) {
              System.out.println("Incorrect task number!");
              break;
            }
            Task taskToComplete = taskList.get(taskNumber - 1);
            taskToComplete.setCompleted(true);
            System.out.println("The task is marked as completed!");
            break;
          case 4:
            System.out.println("Enter the number of the task to be edited:");
            int taskNumberToEdit = scanner.nextInt();
            scanner.nextLine();
            if (taskNumberToEdit < 1 || taskNumberToEdit > taskList.size()) {
              System.out.println("Incorrect task number!");
              break;
            }
            Task taskToEdit = taskList.get(taskNumberToEdit - 1);
            System.out.println("Enter the new content of the task:");
            String newDescription = scanner.nextLine();
            taskToEdit.setDescription(newDescription);
            System.out.println("The task has been edited!");
            break;
          case 5:
            System.out.println("Enter the number of the task you want to delete:");
            int taskNumberToDelete = scanner.nextInt();
            scanner.nextLine();
            if (taskNumberToDelete < 1 || taskNumberToDelete > taskList.size()) {
              System.out.println("Incorrect task number!");
              break;
            }
            taskList.remove(taskNumberToDelete - 1);
            System.out.println("Task deleted!");
            break;
          case 6:
            System.out.println("Entrance...");
            System.exit(0);
            break;
          default:
            System.out.println("Incorrect content. Try again.");
            break;
        }
      }
    }
  }
}
