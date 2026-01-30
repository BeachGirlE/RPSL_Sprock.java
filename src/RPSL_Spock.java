import java.util.Random;
import java.util.Scanner;

public class RPSL_Spock {
    public static void main(String[] args) {
        // Intro to the game:
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Welcome " + userName + ". You are about to play a game of 'Rock, Paper, Scissors, Lizard, SPOCK!'");

        //Prompt user to enter a choice
        System.out.println("Please choose one of the following options: Rock, Paper, Scissors, Lizard, or Spock." +
                " Please keep it in all lowercase!");
        String userMove = scanner.nextLine().toLowerCase().trim();

        // Computer's input code:
        // Naming the options for String output
        String[] options = {"rock", "paper", "scissors", "lizard", "spock"};
        Random random = new Random();


        int select = random.nextInt(options.length);
        System.out.println("Computer's choice: " + options[select]);
        // write conditionals for who wins and who gains points!!
        if (userMove.equals(random)) {
            System.out.println("It's a tie");
        } else if((userMove.equals("Scissors") && random.equals("Paper")));

    }
}