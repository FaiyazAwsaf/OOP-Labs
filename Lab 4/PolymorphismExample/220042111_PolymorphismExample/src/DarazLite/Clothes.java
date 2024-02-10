package DarazLite;

public class Clothes extends Products {
    private int size;

    public Clothes(String name, double quantity, String description, double basePrice, int discountCode, int size) {
        super(name, quantity, description, basePrice, discountCode);
        this.size = size;
    };

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
        System.out.println("Price: " + calculatePrice() + "\n");

    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice();
    }
}
