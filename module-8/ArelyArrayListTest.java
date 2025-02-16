//Arely Gil
//02/14/2025
//M8: Programming Assignment

import java.util.ArrayList;
import java.util.Scanner;


 //This program that I put together allows the user to enter integers into an ArrayList.
 //The input stops when the user enters 0, which is also added to the list.
 //Then finds and displays the largest number in the list and if the list is empty, then it returns 0.

public class ArelyArrayListTest {
    
    // Here you can see the largest number returns in the list or 0 if the list is empty.
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }
        
        int maxValue = list.get(0);
        for (Integer num : list) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
    // Here is the main method to take user input and display the largest number.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Enter integers (enter 0 to stop):");
        while (true) {
            int input = scanner.nextInt();
            numbers.add(input);
            if (input == 0) {
                break;
            }
        }
        
        Integer maxNumber = max(numbers);
        System.out.println("The largest number in the list is: " + maxNumber);
    }
}

// https://www.w3schools.com/java/java_arraylist.asp
//https://www.geeksforgeeks.org/arraylist-in-java/
