import java.util.ArrayList;

public class User {
    private String username;
    private int userID;
    private ArrayList<Chef> favoriteChefs;  // Forgot to create array list
    private ArrayList<Recipe> favoriteRecipes;

    public User(String username, int userID, ArrayList<Chef> favoriteChefs, ArrayList<Recipe> favoriteRecipes) {
        this.username = username;
        this.userID = userID;
        this.favoriteRecipes = favoriteRecipes;
        this.favoriteChefs = favoriteChefs;
    }
    public void addFavoriteRecipe(Recipe recipe) {
        favoriteRecipes.add(recipe);
    }

    public void removeFavoriteRecipe(Recipe recipe) {
        favoriteRecipes.remove(recipe);
    }

    public void addFavoriteChef(Chef chef) {
        favoriteChefs.add(chef);
    }

    public void removeFavoriteChef(Chef chef) {
        favoriteChefs.remove(chef);
    }

    public ArrayList<Chef> getFavoriteChefs() {
        return favoriteChefs;
    }

    public ArrayList<Recipe> getFavoriteRecipes() {
        return favoriteRecipes;
    }

    @Override
    public String toString() {
        return
                "username = " + username +
                ", userID = " + userID +
                ", Favorite Chefs = " + favoriteChefs +
                ", Favorite Recipes = " + favoriteRecipes;
    }
}
