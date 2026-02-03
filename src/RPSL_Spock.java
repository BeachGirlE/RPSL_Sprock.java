import java.util.Random;
import java.util.Scanner;

public class RPSL_Spock {
    public static void main(String[] args) {
        // Intro to the game:
        int userPoints = 0;
        int CPUPoints = 0;
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String userMove = scanner.nextLine().toLowerCase().trim();
        ;
        System.out.println("Welcome " + userName + ". You are about to play a game of 'Rock, Paper, Scissors, Lizard, SPOCK!' against the Computer >:).");
        System.out.println("You are going to start with 0 points. Gain a point after each win and first to 3 points win!");
        System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");

        //Prompt user to enter a choice
        //System.out.println("Choose one of the following options: Rock, Paper, Scissors, Lizard, or Spock." + " Please keep it in all lowercase!");


        System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
        boolean isValid = false;
        while (!isValid) {
            try {
                //Prompt user to enter a choice
                System.out.println("Choose one of the following options: Rock, Paper, Scissors, Lizard, or Spock." + " Please keep it in all lowercase!");
                userMove = scanner.nextLine().toLowerCase().trim();
                isValid = true;
            } catch (Exception e) {
                System.out.println("Something went wrong, please check your input and be sure that it is a valid option");
            }
        }
        isValid = false;
        // Computer's input code:
        // Naming the options for String output
        String[] options = {"rock", "paper", "scissors", "lizard", "spock"};
        Random random = new Random();
        int select = random.nextInt(options.length);
        System.out.println("Computer's choice: " + options[select]);
        // write conditionals for who wins and who gains points!!
        boolean points = false;
        while (points) ;
        {
            if (userMove.equals(random)) {
                System.out.println("It's a tie, no points gained.");
            }

            if (userPoints != 3 || CPUPoints != 3) {
                System.out.println("Choose one of the following options: Rock, Paper, Scissors, Lizard, or Spock." + " Please keep it in all lowercase!");
                userMove = scanner.nextLine().toLowerCase().trim();

                // Computer's input code:
                // Naming the options for String output
                random = new Random();

                select = random.nextInt(options.length);
                System.out.println("Computer's choice: " + options[select]);

                if (userMove.equals(random)) {
                    System.out.println("It's a tie, no points gained.");
                }
                if
                (userMove.equals("rock") && random.equals("scissors") ||
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
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
                } else {
                    System.out.println("you lost!");
                    ++CPUPoints;
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
                }

                if (userPoints == 3) {
                    System.out.println("Winner!" + userName + " is Champion!!");
                } else if (CPUPoints == 3) {
                    System.out.println("Winner! The Computer has triumphed over your skill");
                }
            }
        }
    }
}