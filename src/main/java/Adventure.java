public class Adventure {
    //Player instans
    Player player = new Player();

    //Metode til at flytte forskellige retninger
    public boolean goNorth() {
        if (player.getCurrentRoom().getNorth() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getNorth());
            return true;
        }

    }

    public boolean goEast() {
        if (player.getCurrentRoom().getEast() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getEast());
            return true;
        }
    }

    public boolean goWest() {
        if (player.getCurrentRoom().getWest() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getWest());
            return true;
        }
    }

    public boolean goSouth() {
        if (player.getCurrentRoom().getSouth() == null) {
            return false;
        } else {
            player.setCurrentRoom(player.getCurrentRoom().getSouth());
            return true;
        }
    }
}
