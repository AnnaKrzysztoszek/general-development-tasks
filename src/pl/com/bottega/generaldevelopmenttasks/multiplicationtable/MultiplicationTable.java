package pl.com.bottega.generaldevelopmenttasks.multiplicationtable;

/**
 * Created by anna on 09.11.2016.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        int row = 11;
        int column = 11;
        int table[][] = new int[row][column];

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < column; j++) {
                table[i][j] = i * j;
                System.out.format("%4d |", table[i][j]);
            }
            System.out.println();
            System.out.print("------------------------------------------------------------");
            System.out.println();
        }
    }
}
