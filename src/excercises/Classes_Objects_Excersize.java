package excercises;
import org.launchcode.java.demos.lsn3classes1.Student;

public class Classes_Objects_Excersize {
    public static void main(String[] args) {
        Student dalton = new Student("Dalton", 12345, 1, 4.0);

        System.out.println("Hello " + dalton.getName()+ ", your ID is " + dalton.getStudentId() + " and you have "
        + dalton.getNumberOfCredits() + " credit and a GPA of " + dalton.getGpa());

    }
}
