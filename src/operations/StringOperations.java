package operations;

import telran.view.InputOutput;

import java.util.*;


public class StringOperations {
    public static void isAnagram(InputOutput inputOutput) {
        String firstString = inputOutput.readString("Enter first string to check anagram");
        String secondString = inputOutput.readString("Enter second string to check anagram");

        char first[] = firstString.toLowerCase().trim().toCharArray();
        char second[] = secondString.toLowerCase().trim().toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if (Arrays.equals(first, second)) {
            inputOutput.writeLn("Words are anagram!");
        } else {
            inputOutput.writeLn("Words are not anagram");
        }

    }

    public static void joiningStrings(InputOutput inputOutput) {
        String option1 = "option1";
        String option2 = "option2";
        String option3 = "option3";

        List<String> options = new ArrayList<>(Arrays.asList(option1, option2, option3));
        String prompt = "Enter any line from the suggested";

        String input = inputOutput.readOption(prompt, options);
        inputOutput.writeLn(input);

    }
}







