import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        List<Book> books = new ArrayList<>();
//        books.add(new Book("shoe dog", "phil knight", Genre.BIOGRAPHY));

//        writeBooksToFile(books);

        List<Book> storedBooks = readBooksFromFile();

        for (Book book : storedBooks) {
            book.printDetails();
        }
    }


//    public static void writeBooksToFile(List<Book> books) {
//        File file = new File("books.txt");

//        try {
//            boolean value = file.createNewFile();
//            if(value) {
//                System.out.println("New file is created");
//            }
//            else {
//                System.out.println("File not found");
//            }
//        }
//        catch (Exception e) {
//            e.getMessage();
//            e.getStackTrace();
//        }

//        try{
//           FileWriter fileWriter = new FileWriter(file, true);
//            for (Book book : books) {
//                fileWriter.write(book.getName()  + "," + book.getAuthor() + "," + book.getGenre() + "\n");
//            }
//            fileWriter.close();
//            System.out.println("Books written to file successfully.");
//
//
//        }
//        catch (IOException e) {
//            System.err.println("Error writing books to file: " + e.getMessage());
//        }
//        catch (Exception e) {
//            e.getMessage();
//        }
//    }


//     Read books from file and display
    public static List<Book> readBooksFromFile() {
        List<Book> storedBooks =  new ArrayList<>();
        File file = new File("books.txt");


        try {
            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String fileData = fileReader.nextLine();

                String parts[] = fileData.split(",");
                if (parts.length == 3) {
                    String name = parts[0].trim();
                    String author = parts[1].trim();
                    String x = parts[2].trim();

                    Genre genre = Genre.valueOf(x);

                    storedBooks.add(new Book(name, author, genre));
                }

            }

        } catch (Exception e) {
            e.getMessage();

        }
        return storedBooks;
    }

    }
