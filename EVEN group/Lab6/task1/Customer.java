package task1;

import java.util.ArrayList;

public class Customer {
    public String name;
    public Review review;
    public ArrayList<Review> reviews;
    public ShoppingCart cart;

    public Customer(String name) {
        this.name = name;

        this.reviews = new ArrayList<>();

        /* Composition with shoppingcart object
         * When a new customer object ( a customer account ) is created
         * it must have a shopping cart, doesn't matter if its empty.
         *
         * this is a good example of composition
         */
        this.cart = new ShoppingCart();
    }

    public void purchase(Product product) {
        cart.items.add(product);
    }

    public void giveReview(Product product, String message, Review.Rating rating) {
        review = new Review(message, rating);
        product.setReview(review);
    }

    // Aggregation relation with Product and Review class together
    public void giveReview(Product product, Review review) {
        // delegation
        // actual task of giving the review is done by setReview of product class
        product.setReview(review);
    }

}
