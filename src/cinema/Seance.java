package cinema;

import java.util.Objects;

public class Seance {
    private Movie movie;
    private Time startTime;
    private Time endTime;

    public Seance(Movie movie, Time startTime) {
        this.movie = movie;
        this.startTime = startTime;
        int endTimeMin = startTime.getMin()+movie.getDuration().getMin();
        int endTimeHour = startTime.getHour()+movie.getDuration().getHour();
        Time end = new Time(endTimeHour,endTimeMin);
        Time.normalizeTime(end);
        this.endTime = end;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) &&
                Objects.equals(startTime, seance.startTime) &&
                Objects.equals(endTime, seance.endTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(movie, startTime, endTime);
    }
}
