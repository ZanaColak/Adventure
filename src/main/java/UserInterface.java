import java.util.Scanner;

public class UserInterface {

    private Scanner sc = new Scanner(System.in);

    public void startprogram() {
        //UserInput
            System.out.println("""
                    Welcome To The Adventure Game
                    Where do you want to go?
                    7. Look for the description of the room
                    8. Help for instructions
                    9. Exit the game
                                
                        """);
            String userInput = sc.nextLine().toLowerCase();
           // int number = sc.nextInt();

            switch (userInput){
                case "go north", "north":
                    System.out.println("you are going north ");
                    break;
                    case

            }
        }
    }
