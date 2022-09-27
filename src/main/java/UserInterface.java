import java.util.Scanner;

public class UserInterface {

    private boolean gameRunning = true;
    private Scanner sc = new Scanner(System.in);

    public void startprogram() {
        //UserInput
        System.out.println("""
                Welcome To The Adventure Game
                Where do you want to go?
                    """);
        String userInput = sc.nextLine().toLowerCase();

while (gameRunning)
            switch (userInput) {
                case "go north", "north":
                    System.out.println("You are going north ");
                    break;
                case "go east", "east":
                    System.out.println("You are going east");
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
