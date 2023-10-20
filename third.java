// pangram code.//

import java.util.HashSet;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to check if it's a pangram: ");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Remove spaces and convert the input to lowercase
        input = input.replaceAll(" ", "").toLowerCase();

        // Use a HashSet to keep track of unique letters
        HashSet<Character> uniqueLetters = new HashSet<>();

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                uniqueLetters.add(ch);
            }
        }

        // Check if the set of unique letters contains all 26 alphabet characters
        return uniqueLetters.size() == 26;
    }
}
