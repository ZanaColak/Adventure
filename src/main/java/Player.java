import java.util.ArrayList;

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
    public void dropItem (){

    }
    public void takeItem (String name){

        //TODO
        Item findItem = currentRoom.findItem(name);
        inventory.add(findItem);
        currentRoom.getItem(name).remove(findItem);
    }
}
