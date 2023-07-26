enum WeekdayENUM {
    SEGUNDA("segunda-feita"),
    TERCA("terça-feira"),
    QUARTA("quarta-feira"),
    QUINTA("quinta-feira"),
    SEXTA("sexta-feira"),
    SABADO("sábado"),
    DOMINGO("domingo");

    private final String weekDay;
    WeekdayENUM(String weekDay){
        this.weekDay = weekDay;
    }

    public String getWeekDay(){
        return weekDay;
    }

    public static WeekdayENUM fromString(String weekDay) {
        for (WeekdayENUM day : WeekdayENUM.values()) {
            if (day.weekDay.equalsIgnoreCase(weekDay)) {
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid input string: " + weekDay);
    }
}
public class Task03 {

    public static void main(String[] args) {

        String input = "sábado";
        WeekdayENUM dia = WeekdayENUM.fromString(input);
        System.out.printf("%s -> %s\n", input, dia);

        input = "terça-feira";
        dia = WeekdayENUM.fromString(input);
        System.out.printf("%s -> %s\n", input, dia);
    }
}
