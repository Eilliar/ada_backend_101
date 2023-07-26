enum WeekdayENUM {
    SEGUNDA(new String[] {"segunda-feira", "segunda", "seg"}),
    TERCA(new String[] {"terça-feira", "terça", "ter"}),
    QUARTA(new String[] {"quarta-feira", "quarta", "qua"}),
    QUINTA(new String[] {"quinta-feira", "quinta", "qui"}),
    SEXTA(new String[] {"sexta-feira", "sexta", "sex"}),
    SABADO(new String[] {"sábado", "sab"}),
    DOMINGO(new String[] {"domingo", "dom"});

    private final String[] keywords;
    WeekdayENUM(String[] keywords){
        this.keywords = keywords;
    }

    public String[] getKeywords(){
        return keywords;
    }

    public static WeekdayENUM fromString(String weekDay) {
        for (WeekdayENUM keywords : WeekdayENUM.values()) {
            for(String keyword: keywords.getKeywords()){
                if (keyword.equalsIgnoreCase(weekDay)) {
                    return keywords;
                }
            }
        }
        throw new IllegalArgumentException("Invalid input string: " + weekDay);
    }
}

public class Task03 {

    public static void main(String[] args) {

        String[] input = {"dom", "segunda-feira", "terça", "qua", "quinta-feira", "sexta", "sab"};
        for(String day: input){
            WeekdayENUM dayEnum = WeekdayENUM.fromString(day);
            System.out.printf("%s -> %s\n", day, dayEnum);
        }
    }
}
