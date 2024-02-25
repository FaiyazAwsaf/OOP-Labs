import java.util.ArrayList;

public class Recipe {
    private String name;
    private Chef chef;

    public Recipe(String name, Chef chef) {
        this.name = name;
        this.chef = chef;
    }

    public String getName() {
        return name;
    }

    public Chef getChef() {
        return chef;
    }
    public String toString() {
        return getName();
    }

}