import java.util.ArrayList;
import java.util.Scanner;

public class MarksAndStudents {

    public static void main(String[] args) {
        ArrayList<Double> marks = new ArrayList<>();
        double marksSum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of subjects ");
        int noOfSubjects = scanner.nextInt();

        for (int i = 0; i < noOfSubjects; i++) {
            System.out.println(":> ");
            marks.add(scanner.nextDouble());
        }

        for (double mark : marks) {
            marksSum += mark;
        }

        System.out.println("Total marks : " + marksSum);
        System.out.println("Percentage : " + (marksSum / (noOfSubjects)));

    }


}
