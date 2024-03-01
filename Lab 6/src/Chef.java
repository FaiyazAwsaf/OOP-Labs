import java.util.ArrayList;

public class Chef {
    private String name;
    private int ChefID;
    ArrayList<Recipe> chefRecipe;

    Recipe R1, R2, R3;

    public Chef(String name, int ChefID) {
        this.name = name;
        this.ChefID = ChefID;

        this.R1 = new Recipe("Bhaat",this);
        this.R2 = new Recipe("Saussage Porota", this);
        this.R3 = new Recipe("Khichuri", this);
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


