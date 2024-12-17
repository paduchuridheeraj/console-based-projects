import models.Item;
import services.InventoryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryService inventoryService = new InventoryService();

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Update Item");
            System.out.println("3. Delete Item");
            System.out.println("4. View All Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Item Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    inventoryService.addItem(new Item(id, name, price, quantity));
                    break;

                case 2:
                    System.out.print("Enter Item ID to update: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    inventoryService.updateItem(updateId, newPrice, newQuantity);
                    break;

                case 3:
                    System.out.print("Enter Item ID to delete: ");
                    int deleteId = scanner.nextInt();
                    inventoryService.deleteItem(deleteId);
                    break;

                case 4:
                    inventoryService.displayItems();
                    break;

                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
