import java.util.Scanner;

public class F2C {
    double F, C;

    F2C(double F) {
        this.F = F;
    }

    public static void main(String[] args) {
        double tempInFar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit ");
        tempInFar = scanner.nextDouble();

        F2C f2C = new F2C(tempInFar);
        f2C.calculate();
        System.out.println("Temperature in celsius " + f2C.C);
    }

    void calculate() {
        this.C = 5.0 * (this.F - 32.0) / 9.0;
    }

}
