import java.util.Scanner;

public class DaysYearMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d, years, months, days;
        System.out.println("Enter number of days : ");
        d = scanner.nextInt();

        years = d / 365;
        d = d % 365;
        months = d / 30;
        days = d % 30;
        System.out.println("Years " + years + " " + " Months " + months + " Days " + days);
    }
}
