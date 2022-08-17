import com.sun.security.auth.module.NTSystem;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class keyListener extends KeyAdapter {
    Main game = new Main();
    Human h = new Human();
    Goblin g = new Goblin();

    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyChar() == 'a') {
            game.horPosH = game.horPosH - 1;
        } else if (evt.getKeyChar() == 'w') {
            game.verPosH = game.verPosH - 1;
        } else if (evt.getKeyChar() == 's') {
            game.verPosH = game.verPosH + 1;
        } else if (evt.getKeyChar() == 'd') {
            game.horPosH = game.horPosH + 1;
        } else if (evt.getKeyChar() == 'p') {
            g.setAttack(2);
            g.battle();
        } else if (evt.getKeyChar() == 'b') {
            g.setAttack(1);
            g.battle();

        } else if (evt.getKeyChar() == 'x') {
            System.exit(0);

        } else {
            game.game();
        }
        game.game();
    }
}