// Arely Gil
// January 10,2025
// M1: Programming Assignment

import java.util.Scanner;

public class waterTemp {
    public static void main(String[] args) {

        // Creating a scanner object to read the input
        Scanner scanner = new Scanner(System.in);

        // Now prompt the user to enter the water mass in kg
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = scanner.nextDouble();

        // Prompt the user to enter the initial temperature in celsius
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = scanner.nextDouble();

        // Now prompt the user to enter the final temperature in Celsius
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        // Determine the energy needed using the formula
        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Output the result for the user
        System.out.printf("The energy needed to heat the water is %.2f Joules.%n", Q);

        // Now close the scanner
        scanner.close();
    }
}



// Reference: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html