package cinema;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(new Time(8, 0), new Time(23, 0));
        Movie fastAndFurious = new Movie("Fast and Furious", new Time(2, 40));
        Seance firstForFAF = new Seance(fastAndFurious, new Time(8, 0));
        cinema.addSeance(firstForFAF, String.valueOf(Days.MONDAY));
    }
}
