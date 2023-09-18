import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class EventosEspeciais {

    LocalDate evento1(){
        return LocalDate.of(1990, Month.JULY, 28);
    }

    LocalTime evento2(){
        return LocalTime.of(20, 30);
    }

    LocalDateTime evento3(){
        return LocalDateTime.of(evento1(), evento2());
    }
}
