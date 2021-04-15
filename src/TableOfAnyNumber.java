import java.util.Scanner;

public class TableOfAnyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();
        System.out.println("Enter limit");
        int upto = scanner.nextInt();
        for (int i = 1; i <= upto; i++)
            System.out.println(num + " * " + i + " = " + num * i);
    }
}
