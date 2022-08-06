import java.util.Scanner;

class circle {
    double radius = 1;
    final double pi = 3.14;

    public circle() {
    }

    public circle(double r) {

        radius = r;
    }

    public double getArea() {

        return pi * radius * radius;
    }

    public double getperimeter() {

        return 2 * pi * radius;
    }

}

public class q1 {
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println("Area is " + c1.getArea() + " Perimeter is " + c1.getperimeter());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double r = sc.nextDouble();
        circle c2 = new circle(r);
        System.out.printf("Area is " + c2.getArea() + "Perimeter is " + c2.getperimeter());

    }
}
