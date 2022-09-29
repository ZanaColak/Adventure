import java.util.Scanner;

public class UserInterface {
    private Adventure adventure = new Adventure(); //Metode kald

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
                    adventure.handleRoomDirection(goNorth, "North");
                    break;
                case "go east", "east", "e":
                    boolean goEast;
                    goEast = adventure.goEast();
                    adventure.handleRoomDirection(goEast, "East");
                    break;
                case "go west", "west", "w":
                    boolean goWest;
                    goWest = adventure.goWest();
                    adventure.handleRoomDirection(goWest, "West");
                    break;
                case "go south", "south", "s":
                    boolean goSouth;
                    goSouth = adventure.goSouth();
                    adventure.handleRoomDirection(goSouth, "South");
                    break;
                case "look":
                    adventure.lookRoom();
                    break;
                case "help":
                    System.out.println("""
                            You can choose to go north, east, south or west.
                            You can type look to see the current room's description.
                            You can close the game by typing exit.
                            """);
                    break;
                case "exit":
                    System.out.println("Exiting program..");
                    gameRunning = false;
            }
        }
    }
}