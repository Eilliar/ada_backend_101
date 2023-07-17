public class Task05 {

    public class Solution {
        public static boolean elementosRepetidos(double[] input) {
            boolean hasDuplicate = false;

            for (int i=0; i < input.length - 1; i++){
                for (int j = i+1; j < input.length; j++){
                    if (input[i] == input[j]){
                        hasDuplicate = true;
                    }
                }
            }

            return hasDuplicate;
        }
    }
}
