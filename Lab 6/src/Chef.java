import java.util.ArrayList;

public class Chef {
    private String name;
    private int ChefID;
    ArrayList<Recipe> chefRecipe;

    public Chef(String name, int ChefID) {
        this.name = name;
        this.ChefID = ChefID;
        this.chefRecipe = new ArrayList<>();
    }

    public void addNewRecipe(Recipe recipe) {
        chefRecipe.add(recipe);
    }

    public void removeRecipe(Recipe recipe){
        chefRecipe.remove(recipe);
    }

    public void clearRecipe(Recipe recipe) {
        chefRecipe.clear();
    }

    public ArrayList<Recipe> getChefRecipe() {
        return chefRecipe;
    }

    public String getName() {
        return name;
    }

    public int getChefID() {
        return ChefID;
    }

    public String toString() {
        return getName();
    }
}


