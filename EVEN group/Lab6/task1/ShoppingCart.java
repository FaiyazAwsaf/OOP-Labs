package task1;

import java.util.ArrayList;

public class ShoppingCart {
    public ArrayList<Product> items;
    public double totalPrice;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        totalPrice = 0;
    }

    public void listItems() {
        int i = 0;
        for (Product item : items) {
            System.out.println(i + ". " + item.name);
        }
    }

    public double getTotalPrice() {
        totalPrice = 0;
        for (Product item : items) {
            totalPrice = totalPrice + item.price;
        }
        return totalPrice;
    }
}
