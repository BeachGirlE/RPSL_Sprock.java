import java.util.Scanner;

public class RPSL_Spock {
    public static void main(String[] args) {
        // Intro to the game:
        int userPoints = 0;
        int CPUPoints = 0;
        boolean isGameOver = false;
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Welcome " + userName + ". You are about to play a game of 'Rock, Paper, Scissors, Lizard, SPOCK!' against the Computer >:).");
        System.out.println("You are going to start with 0 points. Gain a point after each win and first to 3 points win!");
        System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");

        // write conditionals for who wins and who gains points!!
        while (!isGameOver) {

            //Prompt user to enter a choice
            System.out.println("Choose one of the following options: 1(rock), 2(paper), 3(scissors), 4(lizard), or 5(Spock)." + "Please enter the number.");
            int userMove = scanner.nextInt();

            // Computer's input code:
            int random = (int) (Math.random() * 6);
            System.out.println("Computer's choice: " + random);
            if (random == 1) {
                System.out.println("Rock");
            } else if (random == 2) {
                System.out.println("Paper");
            } else if (random == 3) {
                System.out.println("Scissors");
            } else if (random == 4) {
                System.out.println("Lizard");
            } else if (random == 5) {
                System.out.println("Spock");
            }
            // conditionals

            if (userMove == random) {
                System.out.println("It's a tie, no points gained.");
            } else if (userMove == 1 && random == 2) {
                System.out.println("Paper covers rock making it claustrophobic, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 1 && random == 5) {
                System.out.println("Spock vaporizes rock, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 2 && random == 3) {
                System.out.println("Scissors cuts paper into a snowflake, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 2 && random == 4) {
                System.out.println("Lizard EATS paper, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 3 && random == 2) {
                System.out.println("Rock crushes scissors into a pulp, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 3 && random == 5) {
                System.out.println("Scissors gets smashed by Spock's fist, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 4 && random == 3) {
                System.out.println("Scissors brutally cuts off lizards head, causing it to slowly, and painfully bleed out, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 4 && random == 1) {
                System.out.println("Rock crushes lizard into a pancake, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 5 && random == 2) {
                System.out.println("Paper has too much information about the mysteries of the deep ocean for spock to understand, he spontaneously combusts into a pile of goo, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else if (userMove == 5 && random == 4) {
                System.out.println("Lizard bites stocks hand, causing an allergic reaction which makes his hand grow and grow until it explodes, you lose");
                ++CPUPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else {
                System.out.println("You magically win!!");
                ++userPoints;
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            }

            if (userPoints == 3) {
                isGameOver = true;
                System.out.println("Winner!" + userName + " is Champion!!");
            } else if (CPUPoints == 3) {
                isGameOver = true;
                System.out.println("Winner! The Computer has triumphed over your skill");
            }


        }
    }

}
