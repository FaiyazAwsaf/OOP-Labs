package task1;

public class Product {
    public String name;
    public int price;
    public String description;
    public Review review;

    public static enum Category {
        GROCERY,
        GADGETS,
        FOODS,
        STATIONARY,
        CLOTHES
    }

    public Category productCategory;

    public Product(String name, int price, String description, Category productCategory) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.productCategory = productCategory;

        // composition relation
        // a product by default will have an "Unrated" review
        this.review = new Review();
    }

    // Aggregation
    public void setReview(Review review){
        this.review = review;
    }

}
