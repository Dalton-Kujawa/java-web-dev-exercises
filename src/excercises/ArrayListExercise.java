package excercises;

import java.util.Scanner;

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> demo = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(sumEven(demo));
        ArrayList<String> wordDemo = new ArrayList<>(Arrays.asList("Right","Fork","Bless","Apple","Left"));
        printNow(wordDemo);
    }
    public static int sumEven(ArrayList<Integer> arr){
        int total = 0;
        for (int integer: arr){
            if(integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }

    public static void printNow(ArrayList<String> arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a positive integer for a length of words you'd like to search for: ");
        int userInt = input.nextInt();

    for(String word: arr){
        if(word.length() == userInt){
            System.out.println(word);
        }
    }
    }
}
