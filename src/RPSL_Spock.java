import java.util.Random;

public class RPSL_Spock {
    public static void main(String[] args) {
        // Computer's input code:
            // Naming the options for String output
        String[] options = {"rock", "paper", "scissors", "lizard", "SPOCK!"};
        Random random = new Random();


        int select = random.nextInt(options.length);
        System.out.println("Computer's choice: " + options[select]);
    }
}