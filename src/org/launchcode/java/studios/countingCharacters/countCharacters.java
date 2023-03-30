package org.launchcode.java.studios.countingCharacters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class countCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String demo = input.next();
        char[] charactersInString = demo.toLowerCase().toCharArray();
        HashMap<Character, Integer> fullCount = new HashMap<>();

        for (char character : charactersInString) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz";

            if (alphabet.contains(Character.toString(character))) {
                char tempChar = character;
                int count = 0;
                for (int i = 0; i < charactersInString.length; i++) {
                    if (tempChar == charactersInString[i]) {
                        count++;
                    }
                }
                fullCount.put(tempChar, count);
            }
        }
        for (Map.Entry<Character, Integer> count : fullCount.entrySet()) {
            System.out.println(count.getKey() + " (" + count.getValue() + ")");
        }



}
}
