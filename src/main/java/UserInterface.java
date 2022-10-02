import java.util.Scanner;

public class UserInterface {
    private Adventure adventure = new Adventure(); //Metode kald

    private Player player = new Player();

    private boolean gameRunning = true; // erklære gamerunning til true
    private Scanner sc = new Scanner(System.in); // Scanner til bruger input

    public void startprogram() { //Metode
        //Menu til brugeren
        System.out.println("""
                Welcome To The Adventure Game
                Where do you want to go?
                    """);

        while (gameRunning) { //While loop som inderholder en switch case, som kører så længe gameRunning er true
            String userInput = sc.nextLine().toLowerCase();
            switch (userInput) {
                case "go north", "north", "n":
                    boolean goNorth;
                    goNorth = adventure.goNorth();
                    handleRoomDirection(goNorth, "North");
                    break;
                case "go east", "east", "e":
                    boolean goEast;
                    goEast = adventure.goEast();
                    handleRoomDirection(goEast, "East");
                    break;
                case "go west", "west", "w":
                    boolean goWest;
                    goWest = adventure.goWest();
                    handleRoomDirection(goWest, "West");
                    break;
                case "go south", "south", "s":
                    boolean goSouth;
                    goSouth = adventure.goSouth();
                    handleRoomDirection(goSouth, "South");
                    break;
                case "look":
                    lookRoom();
                    break;
                case "help":
                    System.out.println("""
                            You can choose to go north, east, south or west.
                            You can type look to see the current room's description.
                            You can close the game by typing exit.
                            """);
                    break;
                case "inventory", "inv", "invent":
                    showPlayerItems();
                    break;
                case "take":
                    System.out.println("Please enter the name of the item you want to take");
                    String itemTake = sc.nextLine().toLowerCase();
                    player.takeItem(itemTake);
                    break;
                case "drop":
                    System.out.println("Please enter the name of the item you want to drop");
                    String itemDrop = sc.nextLine().toLowerCase();
                    player.dropItem(itemDrop);
                    break;
                case "exit":
                    System.out.println("Exiting program..");
                    gameRunning = false;
            }
        }
    }

    public void lookRoom() {
        System.out.println("You are in " + adventure.player.getCurrentRoom().getName() + "\n" + adventure.player.getCurrentRoom().getDescription() + "\n" + "In the room you see: " + showRoomItems(player.getCurrentRoom()));
    }

    public void handleRoomDirection(boolean goDirection, String direction) {
        if (goDirection) {
            System.out.println("You are going: " + direction + "\nYou are now in " + adventure.player.getCurrentRoom().getName() + "\n" + adventure.player.getCurrentRoom().getDescription() + "\n" + "In the room you see: " + showRoomItems(player.getCurrentRoom()));
        } else {
            System.out.println("You cannot go this way");
        }
    }

    //Virker ikke
/*    public String[] showRoomItems(Room room) {
        if (room.getItemList().isEmpty()) {
            System.out.println("Room is empty!");
        }
        for (int i = 0; i < room.getItemList().size(); i++){
            String[] elements = new String[i];
            Item item = room.getItemList().get(i);
            elements[i] = item.getItemName();
            if (i >= room.getItemList().size()) {
                return elements;
            }
        }
        return null;
    }*/

    //Viser kun "bag" i rooms
    public String showRoomItems(Room room) {
        if (room.getItemList().isEmpty()) {
            System.out.println("Room is empty!");
        }
        for (Item item : room.getItemList()){
            return item.getItemName();
        }
        return null;
    }

    public void showPlayerItems () {
        if (player.getInventoryList().isEmpty()) {
            System.out.println("Inventory is empty");
        }
        for (Item item : player.getInventoryList()) {
            System.out.println(item.getItemName());
        }
    }

}