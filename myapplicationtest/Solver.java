package com.example.myapplicationtest;

public class Solver {
    private int[][] board;
    public static final int SIZE=9;
    public static final int EMPTY=0;
    public Solver(int[][] board){
        this.board=new int[SIZE][SIZE];

        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                this.board[i][j]=board[i][j];
            }
        }
    }
    private boolean isInRow(int row,int no){
        for(int i=0;i<SIZE;i++)
            if(board[row][i]==no)return true;
        return false;
    }
    private boolean isInCol(int col,int no){
        for(int i=0;i<SIZE;i++)
            if(board[i][col]==no)return true;
        return false;
    }
    private boolean isInBox(int row,int col,int no){
        int r=row-row%3;
        int c=col-col%3;
        for(int i=r;i<r+3;i++)
            for(int j=c;j<c+3;j++)
                if(board[i][j]==no)return true;
        return false;
    }

    private boolean validity(int row,int col,int no){
        return !isInBox(row, col, no) && !isInCol(col, no) && !isInRow(row, no);
    }

    public boolean solve(){
        for(int row=0;row<SIZE;row++){
            for(int col=0;col<SIZE;col++){
                if(board[row][col]==EMPTY){
                    for(int no=1;no<=9;no++){
                        if (validity(row,col,no)){
                            board[row][col]=no;

                            if(solve())return true;
                            else
                                board[row][col]=EMPTY;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public int[][] solved_sudo(){
        return board;
    }

}
