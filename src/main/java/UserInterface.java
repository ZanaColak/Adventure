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
                case "go north", "north":
                    boolean goNorth;
                    goNorth = adventure.goNorth();
                    if (goNorth) {
                        System.out.println("You are going North ");
                    }
                    else {
                        System.out.println("You cannot go this way");
                    }
                    break;
                case "go east", "east":
                    boolean goEast;
                    goEast = adventure.goEast();
                    if (goEast) {
                        System.out.println("Your are going East");
                    }
                    else {
                        System.out.println("You cannot go this way");
                    }
                    break;
                case "go west", "west":
                    System.out.println("You are going west");
                    break;
                case "go south", "south":
                    System.out.println("You are going south");
                    break;
                case "exit":
                    gameRunning = false;
            }
        }
    }
}