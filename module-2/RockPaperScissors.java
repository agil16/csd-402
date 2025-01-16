
//Name: Arely Gil
//Date: January 15,2025
//Assignment: Mod2: Programming Assignment

import java.util.Random;
import java.util.Scanner;


 // Rock-Paper-Scissors game where the user plays against the computer.
  
  
public class RockPaperScissors {
        public static void main(String[] args) {

        // Utilizing a try-with-resources statement to ensure the scanner is automatically closed.
        try (Scanner inputScanner = new Scanner(System.in)) {

            // Now creating a Random object to determine the computer's choice.
            Random randomGenerator = new Random();

            // Generate the computer's choice: 1 for Rock, 2 for Paper, 3 for Scissors.
            int computerChoice = randomGenerator.nextInt(3) + 1;

            // Welcome message for the user playing
            System.out.println("Hello and Welcome to Relz Rock-Paper-Scissors!");

            // Variable to store the user's selection
            int userChoice;

            // Here is the loop to ensure valid input from the user
            while (true) {
                System.out.println("Select: 1 for Rock, 2 for Paper, 3 for Scissors.");
                if (inputScanner.hasNextInt()) { // Check if the input is a valid integer
                    userChoice = inputScanner.nextInt();
                    if (userChoice >= 1 && userChoice <= 3) { // Making sure that the input is within the valid range
                        break;
                    }
                } else {
                    inputScanner.next(); // Clear invalid input
                }
                // Notify the user about the invalid input
                System.out.println("Invalid selection. Please try again.");
            }

            // Display the user's choice and the computer's choice as well
            System.out.println("You selected: " + convertChoiceToString(userChoice));
            System.out.println("The computer selected: " + convertChoiceToString(computerChoice));

            // Determine the result of the game, tie, winner or loser
            String gameResult;
            if (userChoice == computerChoice) {
                gameResult = "It's a tie! Let's try again.";
            } else if ((userChoice == 1 && computerChoice == 3) || // Here the Rock beats Scissors
                       (userChoice == 2 && computerChoice == 1) || // Here the Paper beats Rock
                       (userChoice == 3 && computerChoice == 2)) { // Here the Scissors beats Paper
                gameResult = "YOU WIN! CONGRATS!!";
            } else {
                gameResult = "YOU LOSE! BETTER LUCK NEXT TIME!!";
            }

            // Display the result of the game
            System.out.println(gameResult);
        }
    }

    //Converts the numeric representation of a choice to its corresponding string.
     //@param choice The numeric representation (1: Rock, 2: Paper, 3: Scissors)
     //@return The string representation of the choice
     
     private static String convertChoiceToString(int choice) {
            return switch (choice) {
                case 1 -> "Rock";
                case 2 -> "Paper";
                case 3 -> "Scissors";
                default -> "Unknown";
            };
    }
}



    // Reference: https://www.w3schools.com/java/java_conditions.asp