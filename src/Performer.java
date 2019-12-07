public class Performer {
    public static int i;
    public static int mark;
    public static int[][] buttonStatus = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };

    /**
     * Updates the status of the buttonStatus array to see what it has
     * @param status
     * @param x
     * @param y
     */
    public static void update(int status, int x, int y) {
        buttonStatus[x][y] = status;
    }

    public static void scan() {
        if(hasTicTacToe(1)) {

        }
        if(hasTicTacToe(2)) {

        }
        if(hasTie()) {

        }
    }

    /**
     * Scans to see if the certain marking has a tictactoe by going through all of the differnet combinations.
     * @param mark
     * @return
     */
    public static boolean hasTicTacToe(int mark) {
        if((buttonStatus[0][0] == mark) && (buttonStatus[0][1] == mark) && (buttonStatus[0][1] == mark)) {
            /*
            X - -
            X - -
            X - -
             */
            return true;
        } else if((buttonStatus[1][0] == mark) && (buttonStatus[1][1] == mark) && (buttonStatus[1][2] == mark)) {
            /*
            - X -
            - X -
            - X -
             */
            return true;
        } else if((buttonStatus[2][0] == mark) && (buttonStatus[2][1] == mark) && (buttonStatus[2][2] == mark)) {
            /*
            - - X
            - - X
            - - X
             */
            return true;
        } else if((buttonStatus[0][0] == mark) && (buttonStatus[1][0] == mark) && (buttonStatus[2][0] == mark)) {
            /*
            X X X
            - - -
            - - -
             */
            return true;
        } else if((buttonStatus[1][0] == mark) && (buttonStatus[1][1] == mark) && (buttonStatus[1][2]) == mark) {
            /*
            - - -
            X X X
            - - -
             */
            return true;
        } else if((buttonStatus[2][0] == mark) && (buttonStatus[2][1] == mark) && (buttonStatus[2][2] == mark)) {
            /*
            - - -
            - - -
            X X X
             */
            return true;
        } else if((buttonStatus[0][0] == mark) && (buttonStatus[1][1] == mark) && (buttonStatus[2][2] == mark)) {
            /*
            X - -
            - X -
            - - X
             */
            return true;
        } else if((buttonStatus[0][2] == mark) && (buttonStatus[1][1] == mark) && (buttonStatus[2][0] == mark)) {
            /*
            - - X
            - X -
            X - -
             */
            return true;
        } else {
            return false;
        }
    }

    /**
     * Checks to see if all of the slots have a mark other than 0 to see if there is a tie.
     * @return
     */
    public static boolean hasTie() {
        if(!(buttonStatus[0][0] == 0) && !(buttonStatus[0][1] == 0) && !(buttonStatus[0][2] == 0) && !(buttonStatus[1][0] == 0) && !(buttonStatus[1][1] == 0) &&
                !(buttonStatus[1][2] == 0) && !(buttonStatus[2][0] == 0) && !(buttonStatus[2][1] == 0) && !(buttonStatus[2][2] == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
