package me.ebrahimhossain.string.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program_1 {

	// Java Program to Find the First Non-repeated Character in a String

	public static char firstNonRepeatedCharacter(String str) {
        Map<Character, Integer> characterCountMap = new LinkedHashMap<>();

        // Count the frequency of each character in the string
        for (char c : str.toCharArray()) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a frequency of 1
        for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // Return a special value if no non-repeated character is found
        return '\0';
    }

    public static void main(String[] args) {
    	//Example 01
    	String input = "system";
        char result = firstNonRepeatedCharacter(input);

        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found.");
        }
        
        //Example 02
        String input2 = "aabb";
        char result2 = firstNonRepeatedCharacter(input2);

        if (result2 != '\0') {
            System.out.println("First non-repeated character: " + result2);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }

}
