package DarazLite;

public class Books extends Products {
    private String author;
    private String publisherName;
    String genre;


    public Books (String name, double quantity, String description, double basePrice, int discountCode, String author, String publisherName, String genre) {
        super(name, quantity, description, basePrice, discountCode);
        this.author = author;
        this.publisherName = publisherName;
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + calculatePrice() + "\n");

    }
    @Override
    public double calculatePrice() {
        double total = super.calculatePrice();
        String lowerCaseGenre = genre.toLowerCase();
        // Decalre a new variable "lowerCaseGenre" that holds the lowercase version of the attribute.
        // then we use lowerCaseGenre.equals. you gotta write the parameter in lowercase

        if (lowerCaseGenre.equals("classic literature")) {
            total *= 0.97;
        } else if (lowerCaseGenre.equals("science fiction")) {
            total *= 0.98;
        }

        return total;
    }

}
