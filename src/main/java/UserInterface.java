import java.util.Scanner;

public class UserInterface {
    private Adventure adventure = new Adventure();

    private boolean gameRunning = true;
    private Scanner sc = new Scanner(System.in);

    public void startprogram() {
        //UserInput
        System.out.println("""
                Welcome To The Adventure Game
                Where do you want to go?
                    """);

        while (gameRunning) {
            String userInput = sc.nextLine().toLowerCase();
            switch (userInput) {
                case "go north", "north", "n":
                    boolean goNorth;
                    goNorth = adventure.goNorth();
                    if (goNorth) {
                        System.out.println("You are going North ");
                    } else {
                        System.out.println("You cannot go this way");
                    }
                    break;
                case "go east", "east", "e":
                    boolean goEast;
                    goEast = adventure.goEast();
                    if (goEast) {
                        System.out.println("Your are going east");
                    } else {
                        System.out.println("You cannot go this way");
                    }
                    break;
                case "go west", "west", "w":
                    boolean goWest;
                    goWest = adventure.goWest();
                    if (goWest) {
                        System.out.println("You are going West");
                    } else {
                        System.out.println("You cannot go this way");
                    }
                    break;
                case "go south", "south", "s":
                    boolean goSouth;
                    goSouth = adventure.goSouth();
                    if (goSouth) {
                        System.out.println("You are going South");
                    } else {
                        System.out.println("You cannot go this way");
                    }
                    break;
                case "exit":
                    gameRunning = false;
                case "help":
                    System.out.println("You can only choose between north, east, south & west");
                    break;
            }
        }
    }
}