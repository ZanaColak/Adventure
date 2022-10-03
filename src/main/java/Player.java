import java.util.*;

public class Player {

    Map map = new Map();
    private Room currentRoom = map.getStarterRoom(); //Initialiserer currentRoom som starterRoom.

    private ArrayList<Item> inventory = new ArrayList<>();

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {

        this.currentRoom = currentRoom;
    }


    public ArrayList<Item> getInventoryList () {
        return inventory;
    }


    public void dropItem (String itemName){
        for (int i = 0; i < getInventoryList().size(); i++){
            Item item = getInventoryList().get(i);
            if (item != null) {
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
