import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, z, x, y;
        System.out.print("Enter choice (1-4):> ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter value of x :> ");
                x = scanner.nextInt();
                z = (int) (Math.pow(x, 2) + 3 * x - 7);
                System.out.println("Result is " + z);
                break;
            case 2:
                System.out.println("Enter the value of x ");
                x = scanner.nextInt();
                y = x++ + ++x;
                System.out.println("X = " + x + " Y = " + y);
                break;
            case 3:
                System.out.println("Enter value of x and y");
                x = scanner.nextInt();
                y = scanner.nextInt();
                z = x++ - --y - --x + x++;
                System.out.println("X = " + x + " Y = " + y + " Z = " + z);
                break;
            case 4:
                boolean a, b, c;
                System.out.println("Enter boolean values for x and y");
                a = scanner.nextBoolean();
                b = scanner.nextBoolean();
                c = a && b || !(a || b);
                System.out.println("Value of z is " + c);
                break;

            default:
                System.out.println("Enter valid choice");
        }
    }
}
