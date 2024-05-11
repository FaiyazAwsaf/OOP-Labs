public class Enemy {
    private String enemyName;
    private int enemyHealth;
    private int enemyHitPower;

    public Enemy(String enemyName, int enemyHealth, int enemyHitPower) {
        this.enemyName = enemyName;
        this.enemyHealth = enemyHealth;
        this.enemyHitPower = enemyHitPower;
    }

    public void Attack(Elementalists target) {
        if (target.getHealth() > 0 && enemyHealth > 0) {
            int newHealth = target.getHealth() - enemyHitPower;
            target.setHealth(newHealth);

            System.out.println(enemyName + " has launched an attack on " + target.getElementalistName());
            System.out.println(target.getElementalistName() + " health: " + newHealth + "\n");
        }
        if(target.getHealth() <= 0) {
            System.out.println(target.getElementalistName() + " is defeated :(" + "\n");
        }
    }

    public String getEnemyName() {
        return enemyName;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public int getEnemyHitPower() {
        return enemyHitPower;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public void setEnemyHitPower(int enemyHitPower) {
        this.enemyHitPower = enemyHitPower;
    }
}


