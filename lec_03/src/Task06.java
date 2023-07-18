import java.util.Scanner;

public class Task06 {
    public static double A (double a, double b, double c) {
        double p = (a + b + c)/2.0;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static boolean isTriangleValid(double a, double b, double c) {
        return ((a + b) > c) & ((a + c) > b) & ((b + c) > a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double area = A(a, b, c);
        if (isTriangleValid(a, b, c)){
            System.out.printf("Area of %.2f x %.2f x %.2f triangle is %.2f", a, b, c, area);
        }
        else {
            System.out.printf("This is not a valid triangle (%.2f x %.2f x %.2f)", a, b, c);
        }
        sc.close();

    }
}
