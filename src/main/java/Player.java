import java.util.*;

public class Player {

    private int healthPoints = 100; //Erklære healthpoints til 100

    Map map = new Map(); //Method call
    private Room currentRoom = map.getStarterRoom(); //Initialiserer currentRoom som starterRoom.

    private ArrayList<Item> inventory = new ArrayList<>(); //Arraylist til inventory

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }


    public ArrayList<Item> getInventoryList() {
        return inventory;
    }
    public void playerHealth (){
        System.out.println("Current health Status:" + healthPoints);
    }

    //Metode til at flytte forskellige retninger
    public boolean goNorth() {
        if (currentRoom.getNorth() == null) {
            return false;
        } else {
            setCurrentRoom(currentRoom.getNorth());
            return true;
        }
    }

    public boolean goEast() {
        if (currentRoom.getEast() == null) {
            return false;
        } else {
            setCurrentRoom(currentRoom.getEast());
            return true;
        }
    }

    public boolean goWest() {
        if (currentRoom.getWest() == null) {
            return false;
        } else {
            setCurrentRoom(currentRoom.getWest());
            return true;
        }
    }

    public boolean goSouth() {
        if (currentRoom.getSouth() == null) {
            return false;
        } else {
            setCurrentRoom(currentRoom.getSouth());
            return true;
        }
    }
    public int getHealthPoints() { //Get method to healthPoitns
        return healthPoints;
    }
    public Item findItem(String itemName) {
        for (Item item : inventory) {
            if (item.getItemName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }
    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public boolean dropItem(String itemName) { // Method to drop items
        boolean isNull = false;
        for (int i = 0; i < getInventoryList().size(); i++) {
            Item item = getInventoryList().get(i);
            if (item.getItemName().equals(itemName)) {
                inventory.remove(item);
                currentRoom.getItemList().add(item);
                isNull = true;
            }
        }
        return isNull;
    }

    public boolean takeItem(String itemName) { //Method to takeItems
        boolean isNull = false;
        Item item = currentRoom.findItem(itemName);
        if (item != null) {
            inventory.add(item);
            currentRoom.removeItem(item);
            isNull = true;
        }
        return isNull;
    }
   public boolean checkFoodRoom(String itemEat) { //Method to check if the food is eatable
       Boolean isFood = false;
       Item item = currentRoom.findItem(itemEat);
       if (item instanceof Food) {
           if (item.getItemName().equals(itemEat)) {
               isFood = true;
           }
       }
       return isFood;
   }
   public boolean checkFoodInventory (String itemEat) { //Method to check the food inventory
       Boolean isFood = false;
       for (Item item : inventory) {
           if (item instanceof Food) {
               if (item.getItemName().equals(itemEat)) {
                   isFood = true;
               }
           }
       }
       return isFood;
   }

   public boolean eat (String itemName){ //Eat Method
        boolean eatItem = false;
        Item item = findItem(itemName);
        if (checkFoodInventory(itemName)){
            removeItem(item);
            Food food = (Food) item;
            healthPoints = healthPoints + ((Food) item).getHealth();
            eatItem = true;
        }
       return eatItem;
   }

}
