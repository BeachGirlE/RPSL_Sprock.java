import java.util.Random;
import java.util.Scanner;

public class RPSL_Spock {
    public static void main(String[] args) {
        // Intro to the game:
        int userPoints = 0;
        int CPUPoints = 0;
        boolean play = false;
        boolean IsGameOver = false;
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Welcome " + userName + ". You are about to play a game of 'Rock, Paper, Scissors, Lizard, SPOCK!' against the Computer >:).");
        System.out.println("You are going to start with 0 points. Gain a point after each win and first to 3 points win!");
        System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");

        //Prompt user to enter a choice
        System.out.println("Choose one of the following options: Rock, Paper, Scissors, Lizard, or Spock." + " Please keep it in all lowercase!");
        String userMove = scanner.nextLine().toLowerCase().trim();

        // Computer's input code:
        // Naming the options for String output
        String[] options = {"rock", "paper", "scissors", "lizard", "spock"};
        Random random = new Random();

        int select = random.nextInt(options.length);
        System.out.println("Computer's choice: " + options[select]);

        // write conditionals for who wins and who gains points!!
        while (!play) {
            do {
                if (userMove.equals(random)) {
                    System.out.println("It's a tie, no points gained.");
                }
                // The winning conditionals:
                if (userMove.equals("rock") && random.equals("scissors") ||
                        (userMove.equals("rock") && random.equals("lizard")) ||
                        (userMove.equals("paper") && random.equals("rock")) ||
                        (userMove.equals("paper") && random.equals("spock")) ||
                        (userMove.equals("scissors") && random.equals("paper")) ||
                        (userMove.equals("scissors") && random.equals("lizard")) ||
                        (userMove.equals("lizard") && random.equals("paper")) ||
                        (userMove.equals("lizard") && random.equals("spock")) ||
                        (userMove.equals("spock") && random.equals("rock")) ||
                        (userMove.equals("spock") && random.equals("scissors"))) {
                    System.out.println("you win!");
                    ++userPoints;
                    play = false;
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
                } else {
                    // If none of those conditionals are met, then the user losesss
                    System.out.println("you lost!");
                    ++CPUPoints;
                    play = false;
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
                }

                if (userPoints == 3) {
                    play = true;
                    System.out.println("Winner!" + userName + " is Champion!!");
                } else if (CPUPoints == 3) {
                    play = true;
                    System.out.println("Winner! The Computer has triumphed over your skill");
                }

            }
            while (play == false);

        }
    }

}
