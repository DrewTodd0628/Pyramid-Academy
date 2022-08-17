

import java.awt.*;
import javax.swing.*;

public class createWindow {

    private static JFrame win = new JFrame();
    private static JTextField listener = new JTextField();
    private static JLabel label = new JLabel();
    public static String text = "<html><body>";
    public static void build() {
        listener.addKeyListener(new keyListener());
        win.add(listener);
        win.add(label, BorderLayout.CENTER);
        win.setSize(315, 315);
        win.setVisible(true);
    }

    public void print() {
        Main game = new Main();

        if (!game.battleScreen) {
            append("</body></html>");
            label.setText(this.text);
            clear();
        }

    }

    public void appendln(String text) {
        StringBuilder strJ = new StringBuilder();
        strJ.append(this.text).append("<p>").append(text).append("</p>");
        this.text = strJ.toString();
    }

    public void append(String text) {
        StringBuilder strJ = new StringBuilder();
        strJ.append(this.text).append("<span>").append(text).append("</span>");
        this.text = strJ.toString();
    }

    public void clear() {
        this.text = "<html><body>";
    }
}