package rocks.zipcode.io.quiz3.arrays;

import java.lang.reflect.Array;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String[][] tictacBoard;
    public TicTacToe(String[][] board) {
        tictacBoard = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {

        return tictacBoard[value];
    }

    public String[] getColumn(Integer value) {
        String[] outString = new String[3];
        int i=0;
        for (String str[]:tictacBoard) {
            outString[i]  = str[value];
            i++;
        }
        return outString;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
       // String[] rowtobeEval = getRow(rowIndex);
        return checkEqual(getRow(rowIndex));
        //return rowtobeEval[0].equals(rowtobeEval[1]) && rowtobeEval[1].equals(rowtobeEval[2]) && rowtobeEval[0] != " ";
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
       // String[] columntobeEval = getColumn(columnIndex);
       return checkEqual(getColumn(columnIndex));
        // return columntobeEval[0].equals(columntobeEval[1]) && columntobeEval[1].equals(columntobeEval[2]) && columntobeEval[0] != " ";
    }

    public Boolean checkDiagonal() {
        String[] diogEval1 = {tictacBoard[0][0], tictacBoard[1][1], tictacBoard[2][2]}; //diagonal1
        String[] diogEval2 = {tictacBoard[0][2], tictacBoard[1][1], tictacBoard[2][0]}; //diagonal2
        return checkEqual(diogEval1) || checkEqual(diogEval2);


    }

    public boolean checkEqual(String[] strArray)
    {
        return (strArray[0]== strArray[1] && strArray[1] == strArray[2] && strArray[0] != " "); //checking if all the values are equal (X or O)

    }

    public String getWinner() {
        for(int i=0; i<3 ; i++) {

            if(isRowHomogenous(i))
                return tictacBoard[i][0];
            else if (isColumnHomogeneous(i))
                return tictacBoard[0][i];
            else if (checkDiagonal())
                return tictacBoard[1][1];
        }
        return "";
    }

    public String[][] getBoard() {
        return tictacBoard;
    }

}
