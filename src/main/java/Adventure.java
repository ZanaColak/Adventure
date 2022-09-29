public class Adventure {
    //Attribut
    Player player = new Player();
    //Map map = new Map();

    //Metode til at flytte
    public boolean goNorth() {
        if (player.getCurrentRoom().getNorth() == null) {
            return false;
        } else {
            /*player.getCurrentRoom() =*/ player.getCurrentRoom().getNorth();
            return true;
        }

    }

    public boolean goEast() {
        if (player.getCurrentRoom().getEast() == null) {
            return false;
        } else {
            /*player.getCurrentRoom() =*/ player.getCurrentRoom().getEast();
            return true;
        }
    }

    public boolean goWest() {
        if (player.getCurrentRoom().getWest() == null) {
            return false;
        } else {
            /*player.getCurrentRoom() =*/ player.getCurrentRoom().getWest();
            return true;
        }
    }

    public boolean goSouth() {
        if (player.getCurrentRoom().getSouth() == null) {
            return false;
        } else {
            /*player.getCurrentRoom() =*/ player.getCurrentRoom().getSouth();
            return true;
        }
    }

    public void lookRoom() {
        System.out.println("You are in " + player.getCurrentRoom().getName() + "\n" + player.getCurrentRoom().getDescription());
    }

    public void handleRoomDirection(boolean goDirection, String direction) {
        if (goDirection) {
            System.out.println("You are going: " + direction + "\nYou are now in " + player.getCurrentRoom().getName() + "\n" + player.getCurrentRoom().getDescription());
        } else {
            System.out.println("You cannot go this way");
        }
    }
}
