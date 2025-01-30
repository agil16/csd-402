// Arely Gil
//January 29,2025
// M5: Programming Assignment

public class ArrayLocation {

    // Here I have the method to find the location of the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];  // This is the array to hold the row and column of the largest element
        double largest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;  // Here we update row index
                    location[1] = j;  // Here we update column index
                }
            }
        }

        return location;
    }

    // This is where the method to find the location of the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];  // This is the array to hold the row and column of the largest element
        int largest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;  // Here is the update row index
                    location[1] = j;  // Here is the pdate column index
                }
            }
        }

        return location;
    }

    // This is where the method to find the location of the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];  // This is the array to hold the row and column of the smallest element
        double smallest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;  // Here is the update row index
                    location[1] = j;  // Here is the update column index
                }
            }
        }

        return location;
    }

    // This is where the method to find the location of the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];  // This is the array to hold the row and column of the smallest element
        int smallest = arrayParam[0][0];
        location[0] = 0;
        location[1] = 0;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;  // Here is the update row index
                    location[1] = j;  // Here is the update column index
                }
            }
        }

        return location;
    }

    // Finally the main method to test the functionality
    public static void main(String[] args) {
        // This tests with double 2D array
        double[][] doubleArray = {
            {2.5, 3.6, 1.4},
            {5.7, 9.1, 4.5},
            {6.3, 8.9, 7.2}
        };

        int[] largestLocationDouble = locateLargest(doubleArray);
        System.out.println("Largest element in double array is at: (" + largestLocationDouble[0] + ", " + largestLocationDouble[1] + ")");
        int[] smallestLocationDouble = locateSmallest(doubleArray);
        System.out.println("Smallest element in double array is at: (" + smallestLocationDouble[0] + ", " + smallestLocationDouble[1] + ")");

        // This tests with int 2D array
        int[][] intArray = {
            {12, 3, 45},
            {9, 2, 8},
            {7, 15, 10}
        };

        int[] largestLocationInt = locateLargest(intArray);
        System.out.println("Largest element in int array is at: (" + largestLocationInt[0] + ", " + largestLocationInt[1] + ")");
        int[] smallestLocationInt = locateSmallest(intArray);
        System.out.println("Smallest element in int array is at: (" + smallestLocationInt[0] + ", " + smallestLocationInt[1] + ")");
    }
}
