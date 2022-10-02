import java.util.*;

public class Player {

    Map map = new Map();
    private Room currentRoom = map.getStarterRoom(); //Attribut

    private ArrayList<Item> inventory = new ArrayList<Item>();

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {

        this.currentRoom = currentRoom;
    }

    public ArrayList<Item> inventoryList () {
        return inventory;
    }

    public void dropItem (String itemName){
        for (int i = 0; i < inventory.size(); i++){
            Item item = inventory.get(i);
            if (item.getItemName().equals(itemName)) {
                inventory.remove(item);
                currentRoom.getItem(itemName);
                System.out.println("Item removed from inventory");
            }
            else {
                System.out.println("Item in inventory not found");
            }
        }
    }

    public void takeItem (String itemName){
        for (int i = 0; i < currentRoom.itemList().size(); i++){
            Item item = currentRoom.itemList().get(i);
            if (item.getItemName().equals(itemName)) {
                inventory.add(item);
                currentRoom.itemList().remove(itemName);
                System.out.println("Item added to inventory");
            }
            else {
                System.out.println("Item in room not found");
            }
        }
        //TODO
        /*Item findItem = currentRoom.findItem(name);
        inventory.add(findItem);*/
    }
}
