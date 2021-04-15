import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int num;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num ");
        num = scanner.nextInt();

        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Not prime");
        else System.out.println("Prime");
    }
}
