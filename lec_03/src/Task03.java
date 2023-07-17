public class Task03 {
        public static double calculoSalario( double[] input) {
            double percIpca = input[1] / 100.00;
            double newIncome = 0;

            if (input[0] >= 1 & input[0] < 5) {
                newIncome = (1.01 + percIpca) * input[2];
            }
            else if (input[0] >= 5 & input[0] < 10) {
                newIncome = (1.015 + percIpca) * input[2];
            }
            else if (input[0] >= 10) {
                newIncome = ((1.0 + percIpca + 0.02)) * input[2];
            }
            else {
                newIncome = (1.0 + percIpca) * input[2];
            }

            return Math.round(newIncome * 100.0) / 100.0;
        }
}
