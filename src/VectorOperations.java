import java.util.Scanner;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<String> students = new Vector<>();
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add a student name");
            System.out.println("2. Insert a name at a specific index");
            System.out.println("3. Remove a name");
            System.out.println("4. Display the list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name to add: ");
                    String nameToAdd = sc.nextLine();
                    students.add(nameToAdd);
                    System.out.println("Added");
                    break;

                case 2:
                    System.out.print("Enter name to insert: ");
                    String nameToInsert = sc.nextLine();
                    System.out.print("Enter index (1-based): ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 1 && index <= students.size() + 1) {
                        students.add(index - 1, nameToInsert);
                        System.out.println("Inserted");
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 3:
                    System.out.print("Enter name to remove: ");
                    String nameToRemove = sc.nextLine();
                    if (students.remove(nameToRemove)) {
                        System.out.println("Removed");
                    } else {
                        System.out.println("Name not found");
                    }
                    break;

                case 4:
                    System.out.println(students);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}