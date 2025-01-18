
//Arely Gil
//January 17,2025
//Assignment 3


public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 7; // Here we have the number of rows for the pyramid

        // Here I am puting in custom spaces for each row
        int[] customSpaces = {13, 12, 11, 10, 8, 5, 2};

        for (int i = 1; i <= rows; i++) {
            // Now print leading spaces for pyramid alignment
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("   ");
            }

            // Print the left side of the pyramid
            int value = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value *= 2;
            }

            // Print the right side of the pyramid
            value /= 2; // This is where it starts with the last value from the left side
            for (int j = i - 1; j >= 1; j--) {
                value /= 2;
                System.out.print(value + " ");
            }

            // Using custom spaces for the @ symbol alignment
            int extraSpaces = customSpaces[i - 1];
            for (int j = 1; j <= extraSpaces; j++) {
                System.out.print(" ");
            }

            // Printing the @ symbol
            System.out.println("@");
        }
    }
}



