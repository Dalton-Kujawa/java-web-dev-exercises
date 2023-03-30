package excercises;
import java.util.Scanner;
public class MilesPerGal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How man miles have you driven: ");
        Integer miles = input.nextInt();

        System.out.println("How many gallons of gas have you used: ");
        Integer gallons = input.nextInt();

        int mpg = miles / gallons;

        System.out.println("Your fuel efficiency  is about " + mpg + " miles per gallon");
    }
}
