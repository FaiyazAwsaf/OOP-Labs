import java.util.*;

public class Game {
    public static void main (String [] args) {
        Elementalists elementalists1 = new Elementalists("Air_1", 5, 30,140);
        Elementalists elementalists2 = new Elementalists("Water_1", 5, 30,120);
        Elementalists elementalists3 = new Elementalists("Fire_1", 5, 35,85);
        Elementalists elementalists4 = new Elementalists("Earth_1", 5, 20,100);
        Elementalists elementalists5 = new Elementalists("Fire_2", 5, 35,85);

        List<Enemy> enemies = new ArrayList<>();
        enemies.add(new Enemy("RockGolem", 160, 30));
        enemies.add(new Enemy("AirSpirit", 220, 40));
        enemies.add(new Enemy("FireDemon", 260, 40));
        enemies.add(new Enemy("WaterMonster", 200, 35));


        Random random = new Random();
        Enemy enemy = enemies.get(random.nextInt(enemies.size()));

        System.out.println("The team members are: " + elementalists1.getElementalistName() + ", " + elementalists2.getElementalistName() + ", " + elementalists3.getElementalistName() + ", " + elementalists4.getElementalistName()  + ", " + elementalists5.getElementalistName());
        System.out.println("Your enemy: " + enemy.getEnemyName() + "\n");

        enemy.Attack(elementalists1);
        elementalists3.Attack(enemy);
        enemy.Attack(elementalists1);

        elementalists2.Attack(enemy);
        enemy.Attack(elementalists3);

        elementalists4.Attack(enemy);
        elementalists5.Attack(enemy);

        enemy.Attack(elementalists5);
        enemy.Attack(elementalists5);

        elementalists1.Attack(enemy);
        enemy.Attack(elementalists1);
        enemy.Attack(elementalists5);

        elementalists3.Attack(enemy);
        enemy.Attack(elementalists1);


        elementalists2.Attack(enemy);
        elementalists5.Attack(enemy);

        enemy.Attack(elementalists5);

        elementalists4.Attack(enemy);
        elementalists4.Attack(enemy);



    }
}
