public class Adventure {
    //Attribut
    Player player = new Player();
    Map map = new Map();

    //Metode til at flytte
    public boolean goNorth() {
        if (map.player.getCurrentRoom().getNorth() == null) {
            return false;
        } else {
            map.player.getCurrentRoom() = map.player.getCurrentRoom().getNorth();
            return true;
        }

    }

    public boolean goEast() {
        if (map.player.currentRoom.getEast() == null) {
            return false;
        } else {
            map.player.currentRoom = map.player.currentRoom.getEast();
            return true;
        }
    }

    public boolean goWest() {
        if (map.player.currentRoom.getWest() == null) {
            return false;
        } else {
            map.player.currentRoom = map.player.currentRoom.getWest();
            return true;
        }
    }

    public boolean goSouth() {
        if (map.player.currentRoom.getSouth() == null) {
            return false;
        } else {
            map.player.currentRoom = map.player.currentRoom.getSouth();
            return true;
        }
    }

    public void lookRoom() {
        System.out.println("You are in " + map.player.currentRoom.getName() + "\n" + map.player.currentRoom.getDescription());
    }

    public void handleRoomDirection(boolean goDirection, String direction) {
        if (goDirection) {
            System.out.println("You are going: " + direction + "\nYou are now in " + map.player.currentRoom.getName() + "\n" + map.player.currentRoom.getDescription());
        } else {
            System.out.println("You cannot go this way");
        }
    }
}
