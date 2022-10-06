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
       //Food food = (Food) item;
       if (item instanceof Food) {
           //Food food = (Food) item;
           if (item.getItemName().equals(itemEat)) {
               /*healthPoints += food.getHealth();
               currentRoom.removeItem(food);*/
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
        Item item = currentRoom.findItem(itemName);
        if (checkFoodRoom(itemName)){
            currentRoom.removeItem(item);
            Food food = (Food) item;
            healthPoints = healthPoints + ((Food) item).getHealth();
        }
        if (checkFoodInventory(itemName)){

        }else return eatItem;
       return eatItem;
   }

    public int getHealthPoints() { //Get method to healthPoitns
        return healthPoints;
    }
}
