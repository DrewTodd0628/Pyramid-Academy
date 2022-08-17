import static org.junit.jupiter.api.Assertions.*;

class GoblinTest {

    @org.junit.jupiter.api.Test
    int getStrength() {
        Goblin g = new Goblin();
        return g.getStrength();
    }

    @org.junit.jupiter.api.Test
    void setHealth() {
        Goblin g = new Goblin();
        g.setHealth(100);
    }

    @org.junit.jupiter.api.Test
    int getHealth() {
        Goblin g = new Goblin();
        return g.getHealth();
    }

    @org.junit.jupiter.api.Test
    void setAttack() {
        Goblin g = new Goblin();
        g.setAttack(100);
    }

    @org.junit.jupiter.api.Test
    int getAttack() {
        Goblin g = new Goblin();
        return g.getAttack();
    }

    @org.junit.jupiter.api.Test
    void attack() {
        Goblin g = new Goblin();
        g.attack(1000);
    }
}