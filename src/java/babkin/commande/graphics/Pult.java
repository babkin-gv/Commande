package babkin.commande.graphics;

import javax.swing.*;
import java.awt.*;


public class Pult extends JFrame {
    public static void myCreateAndShowAPI() {
        Pult frame = new Pult();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1580, 850));
        frame.pack();
        frame.setVisible(true);
    }
}
