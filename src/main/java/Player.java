public class Player {

    Map map = new Map();
    private Room currentRoom = map.getStarterRoom(); //Attribut


    public Room getCurrentRoom() {

        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}
