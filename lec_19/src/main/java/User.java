import java.util.Optional;
import java.util.function.Function;

public class User {

    private String userName;
    private String password;
    private Optional<String> email;
    private Optional<Integer> age;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.email = Optional.empty();
        this.age = Optional.empty();
    }

    public User(String userName, String password, Optional<String> email, Optional<Integer> age) {
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public Optional<Integer> getAge() {
        return age;
    }

    public void setAge(Optional<Integer> age) {
        this.age = age;
    }

    void showDetails(){

        Function<Integer, String> ageValidation = x -> {
            if (x == 0) return "Information not available";
            else return String.valueOf(x);
        };

        System.out.printf("\nUser name: %s\tUser email: %s\tUser age: %s",
                this.userName,
                this.email.orElse("Information not available"),
                ageValidation.apply(this.age.orElse(0))
                );
    }
}
