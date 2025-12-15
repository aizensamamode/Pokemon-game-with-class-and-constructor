public class Pokemon {
    String name;
    int health;
    int attackPower;
    
    public Pokemon(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attackPower(Pokemon opponent) {
        opponent.health -= this.attackPower;
        System.out.println(this.name + " attacks " + opponent.name + " for " + this.attackPower + " damage!");
    }
    public void displayStatus() {
        System.out.println(this.name + " has " + this.health + " health remaining.");
    }

}
