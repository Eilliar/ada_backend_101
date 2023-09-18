import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Task01 task01 = new Task01();

        task01.CalculateDosages(LocalDate.of(2023, 9, 18), true);
        task01.CalculateDosages(LocalDate.of(2023, 9, 18), false);

    }
}
