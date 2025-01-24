//Arely Gil
//January 23, 2025
//Module 4: Programming Assignment

//My Java program that implements the four overloaded methods to calculate
//the average of arrays. This also has the test program to call and display
//the results.

import java.util.Arrays;

public class ArrayAverageCalculator {

    // Here I have the method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0;
        for (short value : array) {
            sum += value;
        }
        return (short) (sum / array.length);
    }

    // Here I have the method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Here I have the method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // Here I have the method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    // This is the test program
    public static void main(String[] args) {
        // Here are the test arrays
        short[] shortArray = {5, 15, 25};
        int[] intArray = {100, 200, 300, 400};
        long[] longArray = {1000L, 2000L, 3000L, 4000L, 5000L};
        double[] doubleArray = {0.5, 1.5, 2.5, 3.5, 4.5, 5.5};

        // Now we can calculate and display averages
        System.out.println("******* Average Calculations *******");
        System.out.println("Short array: " + Arrays.toString(shortArray));
        System.out.println("Average (Short): " + average(shortArray) + "\n");

        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Average (Int): " + average(intArray) + "\n");

        System.out.println("Long array: " + Arrays.toString(longArray));
        System.out.println("Average (Long): " + average(longArray) + "\n");

        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("Average (Double): " + average(doubleArray));
    }
}
