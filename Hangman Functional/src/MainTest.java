import static org.junit.jupiter.api.Assertions.*;
import static sun.jvm.hotspot.runtime.PerfMemory.end;

class MainTest {
    @Test
    void test() {
        Main main = new Main();

        main.game();
    }

}