import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
    }

    public static int[] sortAscendingOrder(int[] numbers){
        int[] sortedArr = numbers.clone();
        Arrays.sort(sortedArr);
        return sortedArr;
    }

    public static int[] sortDescendingOrder(int[] numbers){
        int[] sortedArr = sortAscendingOrder(numbers);

        for (int i = 0; i < sortedArr.length / 2; i++) {
            int temp = sortedArr[i];
            sortedArr[i] = sortedArr[sortedArr.length - 1 - i];
            sortedArr[sortedArr.length - 1 - i] = temp;
        }
        return sortedArr;
    }
}
