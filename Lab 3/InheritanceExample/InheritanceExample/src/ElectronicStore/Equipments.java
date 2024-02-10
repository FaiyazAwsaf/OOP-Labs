package ElectronicStore;

import java.time.LocalDate;

public class Equipments {
    String manufacture;
    double cost;
    int datePurchased;
    int serialNumber;

    public Equipments(String manufacture, double cost, int datePurchased, int serialNumber, String category) {
        this.manufacture = manufacture;
        this.cost = cost;
        this.datePurchased = datePurchased;
        this.serialNumber = serialNumber;
    }

    public double calculateValue() {
        double value;
        LocalDate currentDate = LocalDate.now();
        value = cost - (cost * Math.pow(0.8, (currentDate.getYear()-datePurchased)));
        return value;
    }

    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacture);
        System.out.println("Cost: $" + cost);
        System.out.println("Date Purchased: " + datePurchased);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Current Value: Tk." + calculateValue());
    }
}
