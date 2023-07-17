public class task02 {
    public static double[] custosCarro( double[] input) {
        double distCost = 100.0 *  input[1] / input[0];
        double taxCost = 100.0 * input[2] / input[0];
        double[] result =  {Math.round(distCost * 100.00) / 100.00,
                Math.round(taxCost * 100.0) / 100.0};
        return result;
    }
}
