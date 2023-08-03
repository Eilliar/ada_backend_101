public class Task02 {


    public static int mul(int limit){
        if(limit == 1){
            return 1;
        }
        return limit * mul(limit -1);
    }

    public static void main(String[] args) {
        System.out.println(mul(5));
    }
}
