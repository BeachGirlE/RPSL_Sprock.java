# Rock, Paper, Scissors, Lizard, Spock Game
#### By Izzy, Emma, and Tatiana

## Overview
- A classic game of rock paper scissors with the addition of lizard and Spock from the TV show "The Big Bang Theory."
- Begin the first round by playing one of the five options (rock, paper, scissors, lizard, Spock).
- You will receive feedback on whether you lost or won that round against the CPU.
- If you lose, the CPU will receive a point, but if you win, you will receive a point.
- First to three points to win.
  
## Winning protocols
  - Scissors cuts Paper
  - Paper covers Rock
  - Rock crushes Lizards
  - Lizard poisons Spock
  - Spock smashes Scissors
  - Scissors decapitates Lizard
  - Lizard eats Paper
  - Paper disproves Spock
  - Spock vaporizes Rock
  - Rock crushes Scissors
    
## Example
  - Round 1
  - User plays `Paper`
  - CPU plays `Lizard`
  - CPU gains 1 point
  - Round 2
  - User plays `Spock`
  - CPU plays `Scissors`
  - User gains 1 point
  - Round 3
  - User plays `Rock`
  - CPU plays `Paper`
  - CPU gains 1 point and now has a score of 2
  - Round 4
  - User plays Lizard
  - CPU plays Paper
  - User gains 1 point and now has a score of 2
  - Round 5
  - User plays `Spock`
  - CPU plays `Spock`
  - CPU and User tied
  - Round 6
  - User plays `Spock`
  - CPU plays `Scissors`
  - User gains 1 point and now has a score of 3
  - Computer says `Winner! " + userName + " is Champion!! Your skill is clearly more superior than this Computer's AI!!`

## Logic:
  - This game operates based off of loops, variables, conditionals, and random generations. The main steps can be broken down into the following broad steps:
    - Welcome: States the name and tells the user the instructions
    - Game Play: Randomizes the CPU's choice, covers the win-lose conditionals, point set up, and rounds
    - Game Ending: Asks if they want to play again
### Welcome:
  - The code begins by initializing the scanner and the mismatch exception.
  - Then it asks for the user's name, so it can display the welcome message.
### Initial Game Play:
  - The code randomizes the CPU's choice while waiting for the user's input
  - Once the user enters their input it compares the two options and prints out the correct condition (win, loose, or tie)
  - It applies the point to the correct player
#### Input Validation:
  - If the input is a letter it will say the input is invalid and not run the code
  - If the input is a number other than the listed number it will not run a win conditional, but it will run the computer's choice.
#### Feedback Generation:
  - Once a valid input is entered it compares the user's guess against the CPU's randomly generated guess
    - If the user's input meets one of the loss conditionals it prints the corresponding loss message for the inputs
    - If the user's input meets one of the win conditionals it prints the corresponding win message for the inputs
    - If the user's input is equal to the CPU's randomly generated choice it prints the tie conditional
### Game Ending:
  - The game ends when one of the players reaches three points 
  - It asks the user if they want to play the game again
    - If they enter `y`, then the score resets and they can play again
    - If they enter `n`, then the game ends and the scanner stops


### Challenges and Bugs:
  - Figuring out how to loop the game if the user wants to continue was  a challenge but the least challenging of them.
  - THE CONDITIONALS!!!!!! It took us FOREVER to figure out a functional way to write them
    - Yes! They are very lengthy. 
    - Yes! There are more efficient ways of doing it, but we did what we did.
  - The try-catch loop thingies are still in a work in progress. Here are a list of bugs that might happen:
    - When you enter a negative number, it may or may not require a space afterward.
    - If you enter the same number twice (that is not 1-5), it won't continue unless you change the number or add a space.
    - If you type in several characters or words with spaces in between (Ex. `lkajeg iaeuy y y`), it will print out `Please type in a number 1-5!` once per word.
    - If you type in several characters or words plus one of the desired numbers that is separated by a space from any additions (Ex. `aljkheaiu 2 lkur y`) , the computer will print out `Please type in a number 1-5!` and then, since a desired number was entered, will continue the code.

    - ##### We are open to any suggestions in order to fix these potential problems. For now...
      - ###### deal with it
  - In case you were wondering... the reason we have the score reset if you play again is because of how we have our `isGameOver` conditional written. 
    - If the score doesn't reset, then the game will stop you after each round once the conditional is met. Again, we did what we did and since it is functional and works, that's what we are going with. 
      - :)