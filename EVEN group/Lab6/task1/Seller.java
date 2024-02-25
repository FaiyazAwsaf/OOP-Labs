package task1;

import java.util.ArrayList;

public class Seller {
    public String name;
    public ArrayList<Product> products;

    public Seller(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Seller(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void sellTo(Customer customer, Product product) {
        // customer purchases the product
        customer.purchase(product);

        // the product is sold out from stock
        // or, we can simply decrease the number of products in stock
        products.remove(product);
    }
}
