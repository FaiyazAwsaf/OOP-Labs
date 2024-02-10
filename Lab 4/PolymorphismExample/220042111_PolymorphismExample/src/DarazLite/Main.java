package DarazLite;

public class Main {
    public static void main(String[] args) {
        Books B1 = new Books("A", 2, "ABC DEF GRF RGRF", 1000, 0, "Faiyaz", "XYZ", "ClaSSic Literature");
        Books B2 = new Books("JSDN", 1, "ABC DEF GRF RGRF", 500,1234,"Faiyaz", "XYZ", "Science Fiction");

        Clothes C1 = new Clothes("POLO Shirt", 2, "Long sleeves\nStripe\nRed and white color", 6700, 1234,42);
        Clothes C2 = new Clothes("BURBERRY Shirt", 1, "Half sleeves\nCheque\nBrown and yellow color", 4500, 14,45);

        B1.displayInfo();
        B2.displayInfo();
        C1.displayInfo();
        C2.displayInfo();



    }
}
