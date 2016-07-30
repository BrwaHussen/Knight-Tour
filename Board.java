
package knight.tour.jh2p;

/**
 *
 * @author Brwa Hussen
 * Contact: brawhussen5@gmail.com
 * www.simplegrapher.com
 */
public class Board {

    public int[][] square = new int[8][8];
    public int[][] access = new int[8][8];

    public final int[] horizontal = new int[8];
    public final int[] vertical = new int[8];
    public int currentRow = 0, currentColumn = 0;
    public int numberOfMoves = 1;

    public Board(int row, int column) {
        currentRow = row;
        currentColumn = column;
        square[row][column] = 1;

        for (int i = 2; i <= 5; i++) {
            for (int j = 2; j <= 5; j++) {
                access[i][j] = 8;
                access[i][0] = 4;
                access[i][1] = 6;
                access[1][j] = 6;
                access[0][j] = 4;
                access[i][7] = 4;
                access[7][j] = 4;
                access[i][6] = 6;
                access[6][j] = 6;
            }
        }

        access[0][0] = 2;
        access[0][7] = 2;
        access[7][0] = 2;
        access[7][7] = 2;

        access[1][1] = 4;
        access[6][6] = 4;
        access[1][6] = 4;
        access[6][1] = 4;

        access[1][0] = 3;
        access[0][1] = 3;
        access[0][6] = 3;
        access[1][7] = 3;
        access[0][6] = 3;
        access[7][1] = 3;
        access[6][7] = 3;
        access[7][6] = 3;

        horizontal[0] = 2;
        horizontal[1] = 1;
        horizontal[2] = -1;
        horizontal[3] = -2;
        horizontal[4] = -2;
        horizontal[5] = -1;
        horizontal[6] = 1;
        horizontal[7] = 2;

        vertical[0] = -1;
        vertical[1] = -2;
        vertical[2] = -2;
        vertical[3] = -1;
        vertical[4] = 1;
        vertical[5] = 2;
        vertical[6] = 2;
        vertical[7] = 1;
    }

    public void move() {
        int tempRow = currentRow, tempColumn = currentColumn, tempAccess = 9;
        for (int i = 0; i < 8; i++) {
            try {
                if ((square[currentRow + vertical[i]][currentColumn + horizontal[i]] == 0)
                        && (access[currentRow + vertical[i]][currentColumn + horizontal[i]] <= tempAccess)) {
                    tempRow = currentRow + vertical[i];
                    tempColumn = currentColumn + horizontal[i];
                    tempAccess = access[tempRow][tempColumn];
                }
            } catch (Exception e) {
            }

        }
        if ((currentRow != tempRow) || (currentColumn != tempColumn))
        {
            currentColumn = tempColumn;
            currentRow = tempRow;
            ++numberOfMoves;
            square[currentRow][currentColumn] = numberOfMoves;
        }
    }
    
    
    public void showData()
    {
        for(int i=0;i<8;i++){
            for(int j:square[i]){
                System.out.printf("%02d ",j);
            }
        System.out.println();
        }
    }

}
