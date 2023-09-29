import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        DataBase myDataBase = new DataBase();

//        Optional<User> user = myDataBase.getByName("user3");
//        Lambda function + Optional
//        user.ifPresentOrElse(user1 -> printUser(user1),
//                () -> System.out.println("User not found."));
//        user.orElseThrow(() -> new RuntimeException("User not found."));

//        user = myDataBase.getByName("user2");
//        user.ifPresentOrElse(user1 -> printUser(user1),
//                () -> System.out.println("User not found."));

        for(User u: myDataBase.userList){
            u.showDetails();
        }
    }

    private static void printUser(User user) {
        System.out.println(user.getUserName());
    }

}
