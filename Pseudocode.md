# Pseudocode :)
### - Check readme for what the game is
## Steps and braindump

### 1. Print out the name of the game
- Allow the user to make a name for themselves
- Make sure the user knows what they are doing, and how to play
  - How to play:
    - They need to know what option beats what option and so forth
    - They should also know who they are going against 
### 2. Loops
- Start a loop for the actual game
  - includes the invalid input, computer randomizer, computer vs user, user options, rounds and if they want to go again
  - there will be other loops in the main game loop
    - such as the invalid input part of the game
### 3. Invalid input
- make an invalid input so that the game will not crash in case the user types in something wrong
  - EX: if they type a random letter or number for their option against the computer, it will print out "please choose a valid option"
### 4. Make a randomizer for the computer
- Have it randomized between rock, paper, scissor, lizard and spock for the computer to go against the user
- Have the option that the computer gets print out when the user picks their option
### 5. Allow the computer to go against a user
- Add in something that will make the computer wait until the user chooses their option, and types it out
### 6. Have the user pick an option to go against the computer(conditional)
- If the option the user picked lost against the computer make it say "[option you picked loses against the computer]" or something like that
  - have it say why they lost against the computer 
    - the else in what is listed below is the losing conditional.
- If the option the user picked wins against the compute make it say "[option you picked won against the computer]" or something like that
  - have it say why the user won against the computer
- If they tie, make it say "You have tied against the computer"
- Make a **loop** so that it will run the conditionals until the user wins the round
### 7. Rounds
- Make it so that it is best out of five round
  - if they tie, the round does not progress
  - if computer or user wins, make it say "[user] or [computer] won, they have gained a point." 
    - "You : 1 | 0 : computer"
  - Once the best out of five(less or more) round ends, ask the user if they want to play again
    - or for each round ask the user if they want to go again
### 8. Go again?
- Ask the user if they want to go again
  - if the user says yes, restart the game
  - if the user says no, end the game(the code will end)
## Optional things :3
### 1. Add in sound
  - background music, sound effects when the user wins or loses, etc
### 2. Graphics, make it look like an actual game :)
  - Animations, or delays 
### 3. Add in a score tracker with the rounds
  - EX: [username]: 0, Computer: 2, ties: 5 

