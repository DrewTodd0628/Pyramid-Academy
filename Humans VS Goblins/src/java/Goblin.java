

import java.util.*;

public class Goblin{
    int strength = 7;
    int health = 30;

    public Goblin() {
    }
    public int getStrength() {

        return strength;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    int attack = 0;
    public void setAttack(int attack){
        this.attack = attack;
    }
    public int getAttack() {
        return attack;
    }
    public Main m = new Main();

    createWindow cW = new createWindow();
    public static Random rand = new Random();


    private static Goblin g;
    private static Human h;
    public void attack(Object obj) {
        g = new Goblin();
        h = (Human) obj;

        cW.appendln("You are being attacked by a goblin!");
        cW.print();
        battle();

    }
    public void battle() {


        cW.appendln("Goblin:");
        cW.appendln("   HP: " + health);
        cW.appendln("   DMG: " + String.valueOf(g.getStrength()));
        cW.appendln("You:");
        cW.appendln("    HP: " + String.valueOf(h.getHealth()));
        cW.appendln("    DMG: " + String.valueOf(h.getStength()));
        cW.appendln("");
        cW.appendln("Attacks ---------    B");
        cW.appendln("    Basic attack deals 30%-50% DMG");
        cW.appendln("---------------------    P");
        cW.appendln("Power attack deals 80%-100% but reduce HP 10%");
        cW.print();

        if (getAttack() == 1) {
            int attackB = rand.nextInt(((h.getStength() / 2) - (h.getStength() / 3)) + 1) + (h.getStength() / 3);
            health = health - attackB;
            System.out.println(health);

        } else if (getAttack() == 2) {
            int attackP = rand.nextInt((h.getStength() - (h.getStength() - (h.getStength() / 5))) + 1) + (h.getStength() - (h.getStength() / 5));
            g.setHealth(g.getHealth() - attackP);
            if (h.getHealth()<10) {
                h.setHealth(0);
            } else {
                h.setHealth(h.getHealth() - (h.getHealth() / 10));
            }

        }

        if (health <= 0) {
            cW.clear();
            cW.appendln("You have defeated the goblin!");
            cW.appendln("Exit game? (X)");
            cW.print();
        } else if (h.getHealth() <= 0) {
            cW.clear();
            cW.appendln("You have been defeated by the goblin");
            cW.appendln("Exit game? (X)");
            cW.print();
        } else {
            int attack = rand.nextInt((strength - (strength - (strength / 8))) + 1) + (strength - (strength / 8));
            h.setHealth(h.getHealth() - attack);
            cW.clear();
            cW.appendln("java.Goblin attacked. You now have " + h.getHealth() + " HP");
        }


    }
}
