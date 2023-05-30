package java_homework_week04;

import java.util.Scanner;

/**
 * Write a java program that takes the user to provide a  single character from the
 * alphabet. Print Vowel or Consonant, depending on the user input. If the user input
 * is not a letter (between a and z or A and z), or is a  string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class P3_FindVowelOrConsonant {

    public static void checkVowelOrConsonant(String alphabet) {
        if ((alphabet.length() > 1) || (!Character.isAlphabetic(alphabet.charAt(0)))) {
            System.out.println("Error: Single alphabet not entered");
        } else if ((alphabet.charAt(0) == 'a') || (alphabet.charAt(0) == 'e') || (alphabet.charAt(0) == 'i')
                || (alphabet.charAt(0) == 'o') || (alphabet.charAt(0) == 'u')) {
            System.out.println("Input alphabet is a Vowel.");
        } else {
            System.out.println("Input alphabet is Consonant.");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet:");
        String alphabet = scanner.next().toLowerCase();
        checkVowelOrConsonant(alphabet);
        scanner.close();
    }

}
