import java.util.Scanner;

public class GreatestAmongThree {
    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();


        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest Number");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest Number");

        else
            System.out.println(num3 + " is the largest Number");
    }
}
