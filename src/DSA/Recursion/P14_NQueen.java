package DSA.Recursion;
import java.util.Scanner;
import java.util.*;

//Problem 14 - NQueen
// we have problem statement we need to place N queen in NXN board such that
//In every row/col must have only one queen and also no queen should attack each other  queen can move in 8 possible directions
public class P14_NQueen {
    public static void main(String[] args) {
        int[][] board = new int[4][4];
        int n = board.length;
        int m = board[0].length;

        NQueen(0, board, n, m);
    }

    //NQueen Function
    private static boolean NQueen(int col, int[][] board, int n, int m) {
        //base case when you place the queen for all the columns and reach the m i.e. no of columns
        if (col == m) {
            // print and return
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            //return true as we are able to place the queen in the board
            return true;
        }


        //for that column try to place the queen in every row if it is right or not
        for(int row = 0; row<n; row ++)
        {
            if(isSafe(board,row,col,n,m))
            {
                board[row][col] = 1;
                if(NQueen(col+1,board,n,m))         return true;
                board[row][col] = 0;
            }
        }

        return false;
    }


    //isSafe function to check whether we are placing queen is safe or not
    private static boolean isSafe(int[][] board,int row, int col,int n, int m)
    {
        //for upper left diagonal
        for(int i = row,j = col; i>=0 && j >=0 ; i--,j--)
        {
            if(board[i][j] == 1)
                return false;
        }

        //for left direction only
        for(int i = row,j = col; i>=0 && j >=0 ; j--)
        {
            if(board[i][j] == 1)
                return false;
        }

        //for lower left diagonal
        for(int i = row,j = col; i<n && j >=0 ; i++,j--)
        {
            if(board[i][j] == 1)
                return false;
        }

        //return true if all the 3 direction is safe
        return true;
    }
}



