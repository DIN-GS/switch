public class Main {
    public static void main(String[] args) {
        Month month = Month.OCTOBER;


        String season = switch (month){
            case JUNE, JULY, AUGUST -> "Summer";
            case FEBRUARY, JANUARY, DECEMBER -> "Winter";
            case SEPTEMBER, OCTOBER, NOVEMBER -> "Autumn (Fall)";
            case MARCH, APRIL, MAY -> "Spring";
            default -> "it is not a season";
        };

        System.out.println(season);
        System.out.println("pullreq_2min");
    }
}