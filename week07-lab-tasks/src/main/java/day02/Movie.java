package day02;

public class Movie {
    private String title;
    private int yearOfMade;
    private String producer;


    public Movie(String title, int yearOfMade, String producer) {
        this.title = title;
        this.yearOfMade = yearOfMade;
        this.producer = producer;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public String getProducer() {
        return producer;
    }
}
