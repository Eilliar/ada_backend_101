import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;

public class Task01 {

    void CalculateDosages(LocalDate inputDate, boolean useMonths){
        System.out.printf("First dosage: %tD%n", inputDate);

        if (useMonths){
            System.out.printf("Second dosage: %tD%n", inputDate.plusMonths(1));
            System.out.printf("Third dosage: %tD%n", inputDate.plusMonths(2));
        }
        else{
            System.out.printf("Second dosage: %tD%n", inputDate.plusDays(30));
            System.out.printf("Third dosage: %tD%n", inputDate.plusDays(60));
        }
    }
}
