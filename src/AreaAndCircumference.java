import java.util.Scanner;

public class AreaAndCircumference {

    double area;
    double circumference;
    double radius;

    AreaAndCircumference(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        double radius;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius :> ");
        radius = scanner.nextDouble();

        AreaAndCircumference areaAndCircumference = new AreaAndCircumference(radius);
        areaAndCircumference.calculateCircumference();
        areaAndCircumference.calculateArea();
        System.out.println("Area : " + areaAndCircumference.area);
        System.out.println("Circumference : " + areaAndCircumference.circumference);

    }


    void calculateCircumference() {
        this.circumference = 2.0 * 3.14 * this.radius;
    }

    public void calculateArea() {
        this.area = 3.14 * this.radius * this.radius;
    }

}
