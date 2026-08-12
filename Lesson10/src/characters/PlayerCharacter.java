package characters;

public class PlayerCharacter {

    int health = 0;
    int magic = 0;

    double strength = 0.0;

    String name = "";

    PlayerCharacter(String nameIn) {
        this.health = 100;
        this.magic = 10;
        this.strength = 3.0;
        this.name = nameIn;
    }

    int attack() {
        System.out.printf("\n%s attacks with strength %.0f\n", this.name, this.strength);
        return (int) strength;
    }

    void takeDamage(int damage) {
        System.out.printf("\t%s's Health Before Damage: %d\n", this.name, this.health);
        int newHealth = this.health - damage;
        System.out.printf("\t%d Damage Taken!\n", damage);
        this.health = newHealth;
        System.out.printf("\t%s Current Health: %d\n", this.name, this.health);
        System.out.println();
    }

    void heal(int heal) {
        this.health += heal;
        System.out.printf("\t%s Healed for %d, Current Health: %d\n", this.name, heal, this.health);
    }

    public static void main() {
        PlayerCharacter jade = new PlayerCharacter("Jade");

        PlayerCharacter willow = new PlayerCharacter("Willow");

        System.out.println("Willow Sees Jade and Charges Forth");
        willow.attack();
        jade.takeDamage(3);
        System.out.println("Jade Drinks a Health Potion");
        jade.heal(2);




    }

}
