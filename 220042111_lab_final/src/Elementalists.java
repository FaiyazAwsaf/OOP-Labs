
public class Elementalists {
    private String elementalistName;
    private int defensivePower;
    private int offensivePower;
    private int health;

    public Elementalists(String elementalistName, int defensivePower, int offensivePower, int health) {
        this.elementalistName = elementalistName;
        this.defensivePower = defensivePower;
        this.offensivePower = offensivePower;
        this.health = health;
    }

    public void Attack(Enemy enemytarget){
        if(enemytarget.getEnemyHealth() > 0 && health > 0) {
            int newHealth = enemytarget.getEnemyHealth() - offensivePower;
            enemytarget.setEnemyHealth(newHealth);

            System.out.println(elementalistName + " hit " + enemytarget.getEnemyName());
            System.out.println(enemytarget.getEnemyName() + " health: " + newHealth + "\n");
        }
        if(enemytarget.getEnemyHealth() <=0) {
            System.out.println("Congratulations! You win !!!!!!!!\n");
        }
    }

    public void heal(Elementalists allyTarget) {

    }




    public String getElementalistName() {
        return elementalistName;
    }

    public int getDefensivePower() {
        return defensivePower;
    }

    public int getOffensivePower() {
        return offensivePower;
    }

    public int getHealth() {
        return health;
    }

    public void setElementalistName(String elementalistName) {
        this.elementalistName = elementalistName;
    }

    public void setDefensivePower(int defensivePower) {
        this.defensivePower = defensivePower;
    }

    public void setOffensivePower(int offensivePower) {
        this.offensivePower = offensivePower;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
