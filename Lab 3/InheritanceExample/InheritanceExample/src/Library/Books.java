package Library;

public class Books {

    String title;
    String author;
    String ISBN;
    String publicationDate;
    String publisher;
    boolean availability;

    public Books(String title, String author, String ISBN, String publicationDate, String publisher, boolean availability){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
        this.availability = availability;
    }

    public void borrowBook() {
        if(availability) {
            availability = false;
        }
        else
            System.out.println(title + "is not available");
    }

    public void returnBook() {
        availability = true;
    }

    public void getDetails() {
        System.out.println("Book name: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}


