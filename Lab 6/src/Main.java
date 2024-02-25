public class Main {
    public static void main(String [] args) {
        Chef Chef1 = new Chef("Awsaf", 220042111);

        Recipe food1 = new Recipe("Pizza", Chef1);
        Recipe food2 = new Recipe("Pasta", Chef1);

        Chef1.addNewRecipe(food1);
        Chef1.addNewRecipe(food2);

        User user1 = new User("Namzy", 220042135);
        user1.addFavoriteChef(Chef1);
        user1.addFavoriteRecipe(food2);


        System.out.println("Chef 1: "+ Chef1.getChefRecipe());

        System.out.println("User Details:\n" + user1);
//        System.out.println("Favorite Chef: " + user1.getFavoriteChefs());
//        System.out.println("Favorite Recipe: " + user1.getFavoriteRecipes());

    }
}