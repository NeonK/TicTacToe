public class Performer {
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
}
