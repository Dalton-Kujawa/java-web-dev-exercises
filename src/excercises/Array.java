package excercises;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {1,1,2,3,5,8};

        String sentence = "I would not, could not, in a box. " +
                           "I would not, could not with a fox. " +
                             "I will not eat them in a house. " +
                                "I will not eat them with a mouse";
        String[] arrayOfSentence = sentence.split("\\.");

        for (int value: array){
            System.out.println(value);
        }

        System.out.println(Arrays.toString(arrayOfSentence));
    }
}
