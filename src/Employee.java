import java.util.Scanner;

public class Employee {

    double basicSalary, dA, hRA, grossSalary;

    Employee(double basicSalary) {
        this.basicSalary = basicSalary;
        this.hRA = this.basicSalary < 1500 ? 0.1 * this.basicSalary : 500;
        this.dA = this.basicSalary < 1500 ? 0.9 * this.basicSalary : 0.98 * this.basicSalary;
        this.grossSalary = this.basicSalary + this.dA + this.hRA;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary;

        System.out.println("Enter Salary ");
        salary = scanner.nextDouble();
        Employee employee = new Employee(salary);
        employee.displayData();

    }

    void displayData() {
        System.out.println("HRA : " + this.hRA + "\n" + "DA : " + this.dA + "\n" + "Gross salary : " + this.grossSalary);
    }
}
