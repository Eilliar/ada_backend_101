enum WeekdayENUM {
    SEGUNDA(new String[] {"segunda-feita", "seg"}),
    TERCA(new String[] {"terça-feira", "ter"}),
    QUARTA(new String[] {"quarta-feira", "qua"}),
    QUINTA(new String[] {"quinta-feira", "qui"}),
    SEXTA(new String[] {"sexta-feira", "sex"}),
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

        String input = "sábado";
        WeekdayENUM dia = WeekdayENUM.fromString(input);
        System.out.printf("%s -> %s\n", input, dia);

        input = "terça-feira";
        dia = WeekdayENUM.fromString(input);
        System.out.printf("%s -> %s\n", input, dia);

        input = "dom";
        dia = WeekdayENUM.fromString(input);
        System.out.printf("%s -> %s\n", input, dia);
    }
}
