import java.util.Random;
import java.util.Scanner;

public class RPSL_Spock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
                // Computer's input code:
            // Naming the options for String output
        String[] options = {"rock", "paper", "scissors", "lizard", "SPOCK!"};
        Random random = new Random();
// Prompt the user to enter their choice
            System.out.println("Choose one of the following options: Rock, Paper, Scissors, Lizard, or Spock");
            // add something that will ensure that the CPU will wait
        String userMove = scanner.nextLine().toLowerCase().trim();
        int select = random.nextInt(options.length);
        System.out.println("Computer's choice: " + options[select]);
        // write conditionals for who wins and who gains points!!
        if (userMove.equals(random)) {
            System.out.println("It's a tie");
        } else if((userMove.equals("Scissors") && random.equals("Paper")));

    }
}