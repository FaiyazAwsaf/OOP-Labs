package DarazLite;

public class Products {
    private String name;
    private double quantity;
    private String description;
    private double basePrice;
    private int discountCode;

    public Products(String name, double quantity, String description, double basePrice, int discountCode) {
        this.name = name;
        this.quantity = quantity;
        this.description = description;
        this.basePrice = basePrice;
        this.discountCode = discountCode;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        if(discountCode == 1234) {
            return 0.9*basePrice*quantity - 50;
        }
        else
            return 0.9*basePrice*quantity;

     }

    public void displayInfo() {
        System.out.println("Product: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Description: " + description);
        System.out.println("Base Price: " + basePrice + " TK");
    }

}

