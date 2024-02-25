package task1;

public class Review {
    public String message;

    public enum Rating {
        FIVE_STAR,
        FOUR_STAR,
        THREE_STAR,
        TWO_STAR,
        ONE_STAR,
        UNRATED
    }

    public Rating rating;

    public Review(String message, Rating rating) {
        this.message = message;
        this.rating = rating;
    }

    public Review() {
        // creating a default review;
        // simply means - no review for this product has been given yet
        this.message = "No reviews yet";
        this.rating = Rating.UNRATED;
    }
}
