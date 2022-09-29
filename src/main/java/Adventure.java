public class Adventure {
    //Attribut
    Player player = new Player();

    //Metode til at flytte
    public boolean goNorth() {
        if (player.currentRoom.getNorth() == null) {
            return false;
        } else {
            player.currentRoom = player.currentRoom.getNorth();
            return true;
        }

    }

    public boolean goEast() {
        if (player.currentRoom.getEast() == null) {
            return false;
        } else {
            player.currentRoom = player.currentRoom.getEast();
            return true;
        }
    }

    public boolean goWest() {
        if (player.currentRoom.getWest() == null) {
            return false;
        } else {
            player.currentRoom = player.currentRoom.getWest();
            return true;
        }
    }

    public boolean goSouth() {
        if (player.currentRoom.getSouth() == null) {
            return false;
        } else {
            player.currentRoom = player.currentRoom.getSouth();
            return true;
        }
    }

    public void lookRoom() {
        System.out.println("You are in " + player.currentRoom.getName() + "\n" + player.currentRoom.getDescription());
    }

    public void handleRoomDirection(boolean goDirection, String direction) {
        if (goDirection) {
            System.out.println("You are going: " + direction + "\nYou are now in " + player.currentRoom.getName() + "\n" + player.currentRoom.getDescription());
        } else {
            System.out.println("You cannot go this way");
        }
    }
}
