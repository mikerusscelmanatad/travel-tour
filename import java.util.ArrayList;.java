import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("1. Add a name");
            System.out.println("2. Delete a name");
            System.out.println("3. Update a name");
            System.out.println("4. Sort names");
            System.out.println("5. Print names");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the name to add: ");
                    String nameToAdd = scanner.nextLine();
                    names.add(nameToAdd);
                    System.out.println("Name added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the name to delete: ");
                    String nameToDelete = scanner.nextLine();
                    names.remove(nameToDelete);
                    System.out.println("Name deleted successfully.");
                    break;
                case 3:
                    System.out.print("Enter the index of the name to update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the new name: ");
                    String newName = scanner.nextLine();
                    names.set(indexToUpdate, newName);
                    System.out.println("Name updated successfully.");
                    break;
                case 4:
                    Collections.sort(names);
                    System.out.println("Names sorted successfully.");
                    break;
                case 5:
                    if (names.isEmpty()) {
                        System.out.println("The name list is empty.");
                    } else {
                        System.out.println("Names:");
                        for (String name : names) {
                            System.out.println(name);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}
