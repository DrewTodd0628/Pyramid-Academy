import com.sun.security.auth.module.NTSystem;

import java.util.*;

public class Main {
    public static String land = "  ";
    public static String goblins = "⛄";
    public static String humans = "⛹";
    public static Random rand = new Random();
    public static int verPosH = 0;
    public static int horPosH = 0;
    public static int verPosZ = rand.nextInt((5 - 1) + 1) + 1;
    public static int horPosZ = rand.nextInt((4 - 1) + 1) + 1;
    public static int verPosG = rand.nextInt((5 - 1) + 1) + 1;
    public static int horPosG = rand.nextInt((4 - 1) + 1) + 1;
    //build jFrame window
    public static createWindow cW = new createWindow();
    private static Human h = new Human();
    private static Goblin g = new Goblin();
    public static boolean battleScreen = false;

    public static void main(String[] args) {

        cW.build();

        game();
    }

    public static void game() {

        battleScreen = false;
        cW.appendln("-------------------------------------------------------------------");
        for (int i=0; i<5; i++) {

            cW.append("|  ");
            for (int a=0; a<6; a++) {

                spawns(i, a);
                cW.append(land + "  |  ");
            }
            cW.appendln("");
            cW.appendln("-------------------------------------------------------------------");
        }

        //System.out.flush();
        cW.print();
    }

    private static void spawns(int ver, int hor) {
        if (verPosH==ver && horPosH==hor) {
            land = humans;
        } else if (verPosG==ver && horPosG==hor) {
            land = goblins;
        } else {
            land = "  ";
        }

        if ((verPosH==ver && horPosH==hor) && (verPosG==ver && horPosG==hor)) {
            //fight goblin
            land = humans;
            cW.clear();
            g.attack(h);
            battleScreen = true;
        }
    }
}
