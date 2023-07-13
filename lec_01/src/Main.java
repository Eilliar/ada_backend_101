public class Main {
//    Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//            C = 5 * ((F-32) / 9).

    public static void main(String[] args) {

        double fahr = 134.8;
        double celsius = fahrenheit2Celsius(fahr);

        System.out.printf("%.2f F is %.2f C.", fahr, celsius);
    }

    public static double fahrenheit2Celsius(double fahr){
        return 5 * ((fahr - 32.0) / 9.0);
    }
}
