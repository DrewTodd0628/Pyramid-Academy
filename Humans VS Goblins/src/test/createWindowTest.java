import static org.junit.jupiter.api.Assertions.*;

class createWindowTest {

    @org.junit.jupiter.api.Test
    void print() {
        createWindow cW = new createWindow();
        cW.print();
    }

    @org.junit.jupiter.api.Test
    void appendln() {
        createWindow cW = new createWindow();
        cW.appendln("test line");
    }

    @org.junit.jupiter.api.Test
    void append() {
        createWindow cW = new createWindow();
        cW.append("test");
    }

    @org.junit.jupiter.api.Test
    void clear() {
        createWindow cW = new createWindow();
        cW.clear();
    }
}