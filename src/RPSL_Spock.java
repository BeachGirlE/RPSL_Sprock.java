import java.util.Random;
import java.util.Scanner;

public class RPSL_Spock {
    public static void main(String[] args) {
        // Intro to the game:
        int userPoints = 0;
        int CPUPoints = 0;
        boolean play = false;
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Welcome " + userName + ". You are about to play a game of 'Rock, Paper, Scissors, Lizard, SPOCK!' against the Computer >:).");
        System.out.println("You are going to start with 0 points. Gain a point after each win and first to 3 points win!");
        System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");



        // write conditionals for who wins and who gains points!!
        while (!play) {

            //Prompt user to enter a choice
            System.out.println("Choose one of the following options: 1(rock), 2(paper), 3(scissors), 4(lizard), or 5(Spock)." + "Please enter the number.");
            int userMove = scanner.nextInt();

            // Computer's input code:
            int random = (int) (Math.random() * 6);
            System.out.println("Computer's choice: " + random);
            if(random == 1){
                System.out.println("Rock");
            }else if (random == 2) {
                System.out.println("Paper");
            }else if(random == 3) {
                System.out.println("Scissors");
            }else if(random == 4) {
                System.out.println("Lizard");
            }else if(random == 5) {
                System.out.println("Spock");
            }
            do {
                if (userMove == random) {
                    System.out.println("It's a tie, no points gained.");
                }
                // The winning conditionals:
                    System.out.println("you win!");
                    // adds a point if user wins
                    ++userPoints;
                    play = false;
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");

                    // If none of those conditionals are met, then the user loses
                    System.out.println("you lost!");
                    ++CPUPoints;
                    play = false;
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");

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
