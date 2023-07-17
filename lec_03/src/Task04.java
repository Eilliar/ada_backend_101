public class Task04 {
    public static int primeiroCaractereUnico(String input) {
        for (int i = 0; i < input.length(); i++) {
            char ich = input.charAt(i);

            long count = input.chars().filter(ch -> ch == ich).count();
            if (count == 1){
                return i;
            }
        }
        return -1;
    }
}
