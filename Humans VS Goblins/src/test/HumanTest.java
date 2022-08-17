import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @org.junit.jupiter.api.Test
    int getHealth() {
        Human h = new Human();
        return h.getHealth();
    }

    @org.junit.jupiter.api.Test
    void setHealth() {
        Human h = new Human();
        h.setHealth(100);
    }

    @org.junit.jupiter.api.Test
    int getStength() {
        Human h = new Human();
        return h.getStength();
    }

    @org.junit.jupiter.api.Test
    void setStength() {
        Human h = new Human();
        h.setStength(100);
    }
}