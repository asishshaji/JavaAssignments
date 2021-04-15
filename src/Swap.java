import java.util.Scanner;

public class Swap {
    int a, b;

    Swap(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a = " + a + " " + "b = " + b);
    }


    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        Swap swap = new Swap(a, b);
        swap.swap();
    }

    void swap() {
        this.a = this.a + this.b;
        this.b = this.a - this.b;
        this.a = this.a - this.b;
        System.out.println("a = " + this.a + " " + "b = " + this.b);
    }
}
