package java_homework_week04;
/**
 * 1. Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message invalid Number.
 * Continue reading until you have read 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the count ie. 1,2,3,4 etc.
 * -For example, the first message printed to the user would be Enter number #1;, the nest Enter number #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

import java.util.Scanner;

public class P1_ReadingUserInputChallenge {

    public static void readTenNumbersAndSum(){

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10){
            System.out.println("Enter number #" + counter + ":");
            boolean verifynumber = scanner.hasNextInt();

            if (verifynumber){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            } else{
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }

    public static void main(String[] args) {
        readTenNumbersAndSum();
    }
}
