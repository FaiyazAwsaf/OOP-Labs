package Library;

public class Main {
    public static void main(String [] args) {
        Books b1 = new Books("Millu", "Nillu", "245JJ32","2010", "Fai", true);
        b1.getDetails();
        b1.borrowBook();
        b1.borrowBook();


    }

}
