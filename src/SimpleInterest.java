import java.util.Scanner;

public class SimpleInterest {

    double finalAmount;
    double initialPrincipalBalance;
    double annualInterestRate;
    double timeInYears;

    SimpleInterest(double initialPrincipalBalance, double annualInterestRate, double timeInYears) {
        this.initialPrincipalBalance = initialPrincipalBalance;
        this.annualInterestRate = annualInterestRate;
        this.timeInYears = timeInYears;
    }

    public static void main(String[] args) {
        double principalBal, interestRate, time;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal balance : ");
        principalBal = scanner.nextDouble();
        System.out.println("Enter interest rate : ");
        interestRate = scanner.nextDouble();
        System.out.println("Enter time in years : ");
        time = scanner.nextDouble();
        SimpleInterest simpleInterest = new SimpleInterest(principalBal, interestRate, time);
        simpleInterest.calculateSimpleInterest();

        System.out.println("Simple interest is " + simpleInterest.finalAmount);

    }

    void calculateSimpleInterest() {
        this.finalAmount = this.initialPrincipalBalance * (1 + (this.annualInterestRate / 100) * this.timeInYears);
    }
}
