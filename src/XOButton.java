import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This is the class that manages the X and O Buttons for the Tic Tac Toe Game.
 * The code I got for this came from this youtube tutorial: https://www.youtube.com/watch?v=Db3cC5iPrOM
 */
public class XOButton extends JButton  implements ActionListener {
    public static int[] XOStatus;
    public static int i = 0;
    public static int tempX;
    public static int tempY;
    ImageIcon X,O;
    byte value = 0;
    /*
    0: nothing
    1: x
    2: O
     */

    /**
     * Main constructor for The Tic Tac Toe game.
     */
    public XOButton() {
        X = new ImageIcon(this.getClass().getResource("X.png"));
        O = new ImageIcon(this.getClass().getResource("O.png"));
        this.addActionListener(this);
        i++;
    }

    public static void getLocation(int x, int y) {
        tempX = (x / 128);
        tempY = (y / 120);
    }

    public void actionPerformed(ActionEvent e) {
        value++;
        value %= 3;
        switch(value) {
            case 0:
                setIcon(null);
                getLocation(this.getX(), this.getY());
                Performer.update(0, tempX, tempY);
                Performer.scan();
                break;
            case 1:
                setIcon(X);
                getLocation(this.getX(), this.getY());
                Performer.update(1, tempX, tempY);
                Performer.scan();
                break;
            case 2:
                setIcon(O);
                getLocation(this.getX(), this.getY());
                Performer.update(2, tempX, tempY);
                Performer.scan();
                break;
        }
    }
}
