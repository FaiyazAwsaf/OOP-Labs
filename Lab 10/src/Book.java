import java.util.List;

public class Book {

    private String name;
    private String author;
    private Genre genre;
    private List<Float> ratings;


    public Book(String name, String author,  Genre genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void printDetails() {
        System.out.println("Title: " + getName() + "Author: " + getAuthor() + "Genre: " + getGenre());
    }

    @Override
    public String toString() {
            return "Title: " + name + "Author: " + author + "Genre: " + genre;
    }

    public void setRatings(List<Float> ratings) {
        this.ratings = ratings;
    }
}

