import java.util.List;
import java.util.Optional;

public class DataBase {

    List<User> userList;

    {
        userList = List.of(new User("user1", "password1"),
                new User("user2", "password2", Optional.of("user1@gmail.com"), Optional.empty()),
                new User("user3", "password3", Optional.of("user3@gmail.com"), Optional.of(42))
        );
    }

    public Optional<User> getByName(String name){
        for(User user: userList){
            if(user.getUserName().equals(name)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
