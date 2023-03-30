package excercises;
import java.util.Scanner;
public class Wonderland {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Please type a single word to search for in the first sentence of Alice in Wonderland (returning True means the word exists in the first sentence): ");
        String word = input.nextLine();

        boolean result = firstSentence.toLowerCase().contains(word.toLowerCase());

        System.out.println(result);

        Integer index = firstSentence.indexOf(word);
        Integer length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = firstSentence.toLowerCase().replace(word.toLowerCase(), "");
        System.out.println(modifiedSentence);


    }
}
