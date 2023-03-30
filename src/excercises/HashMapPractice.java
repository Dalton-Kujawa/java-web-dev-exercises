package excercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String identification;

        System.out.println("Enter your student IDs and Names (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("ID: ");
            identification = input.nextLine();

            if (!identification.equals("")) {
                System.out.print("Name: ");
                String name = input.nextLine();
                students.put(Integer.parseInt(identification), name);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!identification.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }

    }

}
