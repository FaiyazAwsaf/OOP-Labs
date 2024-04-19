package task1;

import task1.Review.Rating;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 80000,
                "Asus Laptop", Product.Category.GADGETS);

        Product product2 = new Product("iPhone", 100000,
                "iPhone 12", Product.Category.GADGETS);

        Product product3 = new Product("Shirt", 2000,
                "Black full sleeve shirt", Product.Category.CLOTHES);

        Seller seller1 = new Seller("Amazon");
        Customer customer1 = new Customer("John");

        seller1.addProduct(product1);
        seller1.addProduct(product2);
        seller1.addProduct(product3);

        seller1.sellTo(customer1, product1);

        customer1.giveReview(product1, "This product is good", Rating.FIVE_STAR);

        System.out.println("Total price for " + customer1.name + " is " +
                customer1.cart.getTotalPrice()
        );

        Review review1 = new Review("pocha product", Rating.FIVE_STAR);
        product1.setReview(review1);
        System.out.println(product1.review);

    }

}
