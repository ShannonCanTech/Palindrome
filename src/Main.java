import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;

        Scanner scan = new Scanner(System.in);

        System.out.println("Is your word a Palindrome.");
        System.out.println("Input a word: ");
        input = scan.nextLine();
        checkPalindrome(input);
    }

    public static boolean checkPalindrome(String input){

            int test = input.length();
            for (int i = 0; i < (test / 2); ++i) {
                if (input.charAt(i) != input.charAt(test - i - 1)) {
                    System.out.println(input + " is not a palindrome.");
                     return false;
                }
            }
            System.out.println(input + " is a palindrome.");
             return true;
        }
    }
