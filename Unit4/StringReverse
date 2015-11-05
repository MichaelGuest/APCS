package StringReverse;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a String: ");
            String word = input.nextLine();
            System.out.println("The reverse string is: " + reverse(word));
        }
    }

    public static String reverse(String word) {
        if (word.length() == 0) {
            return word;
        } else {
            return reverse(word.substring(1)) + word.charAt(0);
        }
    }
}
