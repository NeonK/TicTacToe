import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * This is the class that manages the X and O Buttons for the Tic Tac Toe Game.
 * The code I got for this came from this youtube tutorial: https://www.youtube.com/watch?v=Db3cC5iPrOM
 */
public class XOButton extends JButton  implements ActionListener {
    public static Object[] options = {"X", "O"};
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

    /**
     * Updates the location of each of the buttons by taking its x and y and dividing it by 128 and 120.
     * @param x
     * @param y
     */
    public static void getLocation(int x, int y) {
        tempX = (x / 128);
        tempY = (y / 120);
    }

    /**
     * This is one of the major deciding voids for the program. It sends out a message asking the user
     * which button he/she wants on that square, and then updates it to that mark.
     * @param e
     */
    public void actionPerformed(ActionEvent e) {
        int n = JOptionPane.showOptionDialog(null, "Which mark you would like to place?", "Mark Selection", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if(n == 0) {
            value = 1;
        } else if(n == 1) {
            value = 2;
        } else {
            value = 0;
        }
        // value++;
        // value %= 3;
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
