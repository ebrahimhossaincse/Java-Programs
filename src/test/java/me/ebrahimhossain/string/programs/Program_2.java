package me.ebrahimhossain.string.programs;

import java.util.Scanner;

public class Program_2 {
	//Java Program to Check Palindrome String
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Step 2: Check if the string is a palindrome using a for loop
        boolean isPalindrome = isPalindrome(input);

        // Step 3: Display the result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    // Method to check if a string is a palindrome using a for loop
    public static boolean isPalindrome(String str) {
        int n = str.length();
        System.out.println(n);
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
