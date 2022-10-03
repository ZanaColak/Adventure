import java.util.*;

public class Player {

    Map map = new Map();
    private Room currentRoom = map.getStarterRoom(); //Initialiserer currentRoom som starterRoom.

    private ArrayList<Item> inventory = new ArrayList<>();
//
    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }


    public ArrayList<Item> getInventoryList () {
        return inventory;
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

    public void dropItem (String itemName){
        for (int i = 0; i < getInventoryList().size(); i++){
            Item item = getInventoryList().get(i);
            if (item.getItemName().equals(itemName)) {
                inventory.remove(item);
                currentRoom.getItemList().add(item);
                System.out.println("Item removed from inventory");
            }
            else {
                System.out.println("Item in inventory not found");
            }
        }
    }


    public void takeItem (String itemName){
            Item item = currentRoom.findItem(itemName);
            if (item != null) {
                inventory.add(item);
                currentRoom.removeItem(item);
                System.out.println("Item added to inventory");
            }
            else {
                System.out.println("Item in room not found");
            }

        //TODO
        /*Item findItem = currentRoom.findItem(name);
        inventory.add(findItem);*/
    }
}
