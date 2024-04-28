import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        MenuOption selectedOption;
        do {
            displayMenu();
            int option = scanner.nextInt();
            selectedOption = MenuOption.values()[option - 1];
            switch(selectedOption)
            {
                case ADD_NEW_BOOK:
                    addNewBook();
                    break;
                case SEARCH_FOR_BOOK:
                    searchForBookByTitle ("To Kill a Mockingbird ");
                    break;
                case DISPLAY_ALL_BOOKS:
                    displayAllBooks ();
                    break;
                case ADD_RATINGS:
                    addBookRatings ();
                    break;
                case EXIT:
                    System .out. println (" Exiting program .");
                    break;
                default:
                    System .out. println (" Invalid option ");
            }
        } while (selectedOption != MenuOption.EXIT);
        scanner.close();
    }

    private static void addBookRatings() {
        System.out.println("Enter the title of the book:");
        String title = scanner.nextLine();

        for (Book book : books) {
            if(book.getName().equals(title)) {
                float rating = scanner.nextFloat();

                List<Float> ratings = new ArrayList<>();
                ratings.add(4f);
                ratings.add(3f);
                ratings.add(4f);

                book.setRatings(ratings);
            }
        }

    }

    private static void displayAllBooks() {
        System.out.println("Displaying all books:");
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
    }

    private static void searchForBookByTitle(String book) {
    }
    private static void addNewBook() {
        System.out.println("Enter the title of the book:");
        scanner.nextLine();
        String title = scanner.nextLine();

        System.out.println("Enter the author of the book:");
        String author = scanner.nextLine();

        System.out.println("Enter the genre of the book:");
        String genreStr = scanner.nextLine();
        Genre genre = Genre.valueOf(genreStr.toUpperCase());

        books.add(new Book(title, author, genre));

        System.out.println("Book added successfully.");
    }


    private static void displayMenu() {
        System.out.println(" Choose an option :");
        System.out.println("1. Add a new book ");
        System.out.println("2. Search for a book ");
        System.out.println("3. Display all books ");
        System.out.println("4. Add ratings to a book ");
        System.out.println("5. Exit ");
    }


}
