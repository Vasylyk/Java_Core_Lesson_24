package cinema;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema(new Time(8, 0), new Time(23, 0));
        Schedule schedule = new Schedule();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1-add movie");
            System.out.println("2-add seance");
            System.out.println("3-remove movie");
            System.out.println("4-show movies library");

            switch (s.nextInt()) {
                case 1: {
                    System.out.println("Write title of movie:");
                    String title = sc.nextLine();
                    System.out.println("Duration of film");
                    System.out.println("Hours:");
                    int hourDuration = sc.nextInt();
                    System.out.println("Minutes:");
                    int minDuration = sc.nextInt();
                    String nextInt = sc.nextLine();
                    cinema.addMovieToLibrary(new Movie(title, new Time(hourDuration, minDuration)));
                    break;
                }
                case 2: {
                    System.out.println("Write title of movie:");
                    String title = sc.nextLine();
                    Optional<Movie> movie = cinema.getMoviesLibrary().stream().filter(x -> x.getTitle().equalsIgnoreCase(title)).findFirst();
                    System.out.println("Time to start");
                    System.out.println("Hours:");
                    int hour = sc.nextInt();
                    System.out.println("Minutes:");
                    int min = sc.nextInt();
                    String nextInt = sc.nextLine();
                    System.out.println("Write day");
                    String day = sc.nextLine();
                    cinema.addSeance(new Seance(movie.get(), new Time(hour, min)), day);
                    System.out.println("test");
                    break;
                }
                case 3:{
                    System.out.println("Write title of movie:");
                    String title = sc.nextLine();
                    Optional<Movie> movie = cinema.getMoviesLibrary().stream().filter(x -> x.getTitle().equalsIgnoreCase(title)).findFirst();
                    cinema.removeMovie(movie.get());
                    break;
                }
                case 4:{
                    System.out.println(cinema.getMoviesLibrary().toString());
                    break;
                }
            }
        }
    }
}
