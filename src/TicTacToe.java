import javax.swing.*;
import java.awt.*;

/**
 * This is the main class for a TicTacToe game created by me.
 * The code I got for this came from this youtube tutorial: https://www.youtube.com/watch?v=Db3cC5iPrOM
 */
public class TicTacToe extends JFrame {
    // Global Variables
    // JFrame Setup
    JPanel p = new JPanel();
    XOButton buttons[] = new XOButton[9];

    public static void main(String[] args) {
        new TicTacToe();
    }

    public TicTacToe() {
        super("TicTacToe");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p.setLayout(new GridLayout(3, 3));
        for(int i = 0;i < 9;i++) {
            buttons[i] = new XOButton();
            p.add(buttons[i]);
        }
        add(p);

        setVisible(true);
    }
}
