public class Task06 {
    public static double A (double a, double b, double c) {
        double p = (a + b + c)/2.0;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void main(String[] args) {

        double a = 9;
        double b = 7;
        double c = 14;

        double area = A(a, b, c);

        System.out.printf("Area of %.2f x %.2f x %.2f triangle is %.2f", a, b, c, area);

    }
}
