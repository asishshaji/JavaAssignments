import java.util.Scanner;

public class Marriage {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int age, gender;

    System.out.println("Enter age ");
    age = scanner.nextInt();

    System.out.println("Enter gender (0:F/1:M)");
    gender = scanner.nextInt();

    if ((gender == 0 && age > 18) || (gender == 1 && age > 21)) {
      System.out.println("Eligible");
    } else {
      System.out.println("Not Eligible");
    }
  }
}
