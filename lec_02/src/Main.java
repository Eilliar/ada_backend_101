import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] fruitList = {"Pera", "Laranja", "Maçã", "Tomate", "Caqui"};
        int[] quantity = new int[fruitList.length];
        double[] cost = new double[fruitList.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < fruitList.length; i++){
            System.out.printf("Number of %s: ", fruitList[i]);
            quantity[i] = scanner.nextInt();
            if (quantity[i] > 10 ){
                cost[i] = 1.25 * quantity[i];
            }
            else {
                cost[i] = 1.45 * quantity[i];
            }

            scanner.nextLine();
        }

        System.out.printf("Total Cost: $ %.2f", Arrays.stream(cost).sum());
    }
}
