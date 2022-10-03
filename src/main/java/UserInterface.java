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
                    goNorth = adventure.player.goNorth();
                    handleRoomDirection(goNorth);
                    break;
                case "go east", "east", "e":
                    boolean goEast;
                    goEast = adventure.player.goEast();
                    handleRoomDirection(goEast);
                    break;
                case "go west", "west", "w":
                    boolean goWest;
                    goWest = adventure.player.goWest();
                    handleRoomDirection(goWest);
                    break;
                case "go south", "south", "s":
                    boolean goSouth;
                    goSouth = adventure.player.goSouth();
                    handleRoomDirection(goSouth);
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
                    if (adventure.player.takeItem(itemTake) == true) {System.out.println("Item added to inventory");}
                    else {System.out.println("Item was not found in this room");}
                    break;
                case "drop":
                    System.out.println("Please enter the name of the item you want to drop");
                    String itemDrop = sc.nextLine().toLowerCase();
                    if (adventure.player.dropItem(itemDrop) == true) {System.out.println("Item removed from inventory");}
                    else {System.out.println("Item was not found in your inventory");}
                    break;
                case "exit":
                    System.out.println("Ending adventure..");
                    gameRunning = false;
            }
        }
    }

    public void lookRoom() {
        System.out.println("You are in " + showRoomItems(adventure.player.getCurrentRoom()/*currentRoom*/));
    }

    public void handleRoomDirection(boolean goDirection) {
        if (goDirection) {
            System.out.println("You are going to " + showRoomItems(adventure.player.getCurrentRoom()));
        } else {
            System.out.println("You cannot go this way");
        }
    }

    public String showRoomItems(Room room) {
        if (room.getItemList().isEmpty()) {
            System.out.println("Room is empty!");
        }
        return room.toString();
    }

    public void showPlayerItems () {
        if (adventure.player.getInventoryList().isEmpty()) {
            System.out.println("Inventory is empty");
        }
        for (Item item : adventure.player.getInventoryList()) {
            System.out.println(item.getItemName());
        }
    }
}