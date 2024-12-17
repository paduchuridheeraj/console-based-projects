package services;

import models.Item;
import java.util.ArrayList;
import java.util.List;

public class InventoryService {
    private List<Item> inventory;

    public InventoryService() {
        this.inventory = new ArrayList<>();
    }

    public void addItem(Item item) {
        inventory.add(item);
        System.out.println("Item added successfully: " + item.getName());
    }

    public void updateItem(int id, double newPrice, int newQuantity) {
        for (Item item : inventory) {
            if (item.getId() == id) {
                item.setPrice(newPrice);
                item.setQuantity(newQuantity);
                System.out.println("Item updated successfully: " + item.getName());
                return;
            }
        }
        System.out.println("Item with ID " + id + " not found.");
    }

    public void deleteItem(int id) {
        Item itemToRemove = null;
        for (Item item : inventory) {
            if (item.getId() == id) {
                itemToRemove = item;
                break;
            }
        }
        if (itemToRemove != null) {
            inventory.remove(itemToRemove);
            System.out.println("Item removed successfully: " + itemToRemove.getName());
        } else {
            System.out.println("Item with ID " + id + " not found.");
        }
    }

    public void displayItems() {
        if (inventory.isEmpty()) {
            System.out.println("No items in the inventory.");
        } else {
            System.out.println("Current Inventory:");
            for (Item item : inventory) {
                System.out.println(item);
            }
        }
    }
}
