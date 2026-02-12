import java.util.Scanner; // for the actual game
import java.util.InputMismatchException; // for the try catch for the userMove input
import java.lang.Exception; // for the try catch for the playAgain input

public class RPSL_Spock {
    static void main(String[] args) {
        // Intro to the game:
        int userPoints = 0;
        int CPUPoints = 0;
        boolean continueGame = false;
        System.out.println("Please enter your name.");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        int userMove = 0;
        System.out.println("Welcome " + userName + ". You are about to play a game of 'Rock, Paper, Scissors, Lizard, SPOCK!' against the Computer >:).");
        System.out.println();
        System.out.println("You are going to start with 0 points. Gain a point after each win and first to 3 points win!");
        System.out.println(); // adds line so it isn't crunched together
        System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");

        while (!continueGame) { // The boolean and loop for continuing the game
            boolean isGameOver = false;
            boolean isValid = false;
            while (!isGameOver) { // The actual game loop
                System.out.println("Choose one of the following options: 1 (rock), 2 (paper), 3 (scissors), 4 (lizard), or 5 (Spock). Please enter the number that corresponds with your desired move.");
                //Prompt user to enter a choice and validate if it is valid
                while (!isValid) {
                    try {
                        userMove = scanner.nextInt();
                        if (userMove == 1 || userMove == 2 || userMove == 3 || userMove == 4 || userMove == 5) {
                            isValid = true;
                        } else {
                            throw new InputMismatchException();
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please type in a number 1-5!");
                        scanner.next();
                    }
                }
                isValid = false;
                // Converts the user's number input to a word output
                if (userMove == 1) {
                    System.out.println("Your choice: Rock");
                } else if (userMove == 2) {
                    System.out.println("Your choice: Paper");
                } else if (userMove == 3) {
                    System.out.println("Your choice: Scissors");
                } else if (userMove == 4) {
                    System.out.println("Your choice: Lizard");
                } else { // doesn't need to be specified if it is 5 because it is the only valid option
                    System.out.println("Your choice: Spock");
                }
                // Computer's input code:
                int random = (int) (Math.random() * 6);
                // Converts the Computers's number input to a word output
                if (random == 1 || random == 0) {
                    System.out.println("Computer's choice: Rock");
                } else if (random == 2) {
                    System.out.println("Computer's choice: Paper");
                } else if (random == 3) {
                    System.out.println("Computer's choice: Scissors");
                } else if (random == 4) {
                    System.out.println("Computer's choice: Lizard");
                } else if (random == 5) {
                    System.out.println("Computer's choice: Spock");
                }
                // write conditionals for who wins and who gains points!!
                //this part is if the computer wins
                if (userMove == random || userMove == 1 && random == 0) {
                    System.out.println();
                    System.out.println("It's a tie, no points gained.");
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 1 && random == 2) {
                    System.out.println("Paper covers rock making it claustrophobic, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 1 && random == 5) {
                    System.out.println("Spock vaporizes rock, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 2 && random == 3) {
                    System.out.println("Scissors cuts paper into a snowflake, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 2 && random == 4) {
                    System.out.println("A random lizard sees your sketch of a landscape on paper and suddenly craves it, eats it, and all of a sudden the world collapses, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 3 && random == 1 || userMove == 3 && random == 0) {
                    System.out.println("Rock crushes scissors into a small pile of scrap metal, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 3 && random == 5) {
                    System.out.println("Scissors gets smashed by Spock's fist, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 4 && random == 3) {
                    System.out.println("Scissors brutally cuts off lizards head, causing it to slowly, and painfully bleed out, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 4 && random == 1 || userMove == 4 && random == 0) {
                    System.out.println("Rock crushes lizard into a pancake, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 5 && random == 2) {
                    System.out.println("Paper has too much information about the mysteries of the deep ocean for Spock to understand so he spontaneously combusts into a pile of goo, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 5 && random == 4) {
                    System.out.println("Lizard bites Spock's hand, causing an allergic reaction which makes his hand grow and grow until it explodes, you lose");
                    ++CPUPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");


                    // if user wins:
                } else if (userMove == 1 && random == 3) {
                    System.out.println("Your scissors stop working and you decide to crush them with a rock, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 1 && random == 4) {
                    System.out.println("A deadly lizard starts chasing you, you see a rock and your natural instinct kicks in and you being to bash the rock onto the lizard, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 2 && random == 1 || userMove == 2 && random == 0) {
                    System.out.println("A rock stares at you with a weird face, you get uncomfortable so you cover the rock with a sheet of paper, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 2 && random == 5) {
                    System.out.println("You finally figure out what lurks in the deep ocean, you show it to Spock on a piece of paper but it has so much information on it that he spontaneously combusts, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 3 && random == 2) {
                    System.out.println("You get so irritated with your sibling that you decide to cut up their paper copy birth certificate with scissors, causing them to instantly disappear, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 3 && random == 4) {
                    System.out.println("You get curious to see if a lizards head will regrow just like their tail, so you grab a pair of scissors and decapitate it, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 4 && random == 2) {
                    System.out.println("You get tired of doing your math homework so you get your lizard to eat it, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 4 && random == 5) {
                    System.out.println("Spock mocks the lizard, making it so enraged that it bites Spock, causing a serious allergic reaction, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 5 && random == 3) {
                    System.out.println("Spock feels like the scissors are a threat, so he vaporizes it out of existence, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                } else if (userMove == 5 && random == 1 || userMove == 5 && random == 0) {
                    System.out.println("Spock notices that the rock looks weird, so he vaporizes it, you win!");
                    ++userPoints;
                    System.out.println();
                    System.out.println("You: " + userPoints + " - " + CPUPoints + " : Computer");
                }

                // round system:
                if (userPoints > 0 && userPoints % 3 == 0) {
                    System.out.println();
                    System.out.println("Winner! " + userName + " is Champion!! Your skill is clearly more superior than this Computer's AI!!");
                    isGameOver = true;
                } else if (CPUPoints > 0 && CPUPoints % 3 == 0) {
                    System.out.println();
                    System.out.println("Winner! The Computer has triumphed over your skill... Or cheated... >:)");
                    isGameOver = true;
                }
            }
            // asks the user if they want to play again:
            System.out.println();
            System.out.println("Would you like to play again? (y/n)");
            char playAgain = 'x'; // so there is an original "value" that can be changed
            while (!isValid) {
                try {
                    playAgain = scanner.next().charAt(0);
                    if (playAgain == 'y' || playAgain == 'n') {
                        isValid = true;
                    } else {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Please enter y or n!");
                }
            }
            if (playAgain == 'y') {
                userPoints = 0;
                CPUPoints = 0;
                System.out.println("Kay...");
                System.out.println("Resetting score...");
                System.out.println();
                System.out.println();
                System.out.println("You: " + userPoints + " - " + CPUPoints + " :Computer");
            } else { // like above, it doesn't need to be specified whether it is 'n' because that is the only other valid option
                System.out.println("Thanks for PlAyInG!!");
                continueGame = true;
                scanner.close();//closes the scanner and tells the computer to stop running the code

            }
        }
    }
}