public class solveSudoku {
    public boolean isSafe(char [][] board,int row,int column,int number){
        // Row and Column check
        for(int i=0;i<board.length;i++){
            if(board[i][column]==(char)(number+'0')){  //checking same columne but different row
                return false;
            }
            if(board[row][i]==(char)(number+'0')){     // checking same row but different column
                return false;
            }
        }

        //Grid check
        int startrow=row/3 * 3;
        int startcol=column/3 * 3;

        for(int i=0;i<startrow+3;i++){
            for(int j=0;j<startcol+3;j++){
                if(board[i][j]==(char)(number+'0')){   //checking the number is already availale in the same grid of (3 x 3)
                    return false;
                }
            }
        } return true;
    }
    public boolean helper(char [][] board,int row, int column){
        //Base case
        if(row==board.length){
            return true;
        }

        // to move to new cell
        if(column != board.length-1){
            int newrow=row;
            int newcol=column+1;
        }else {
            int newrow=row+1;
            int newcol=0;
        }
        
        //Now check if the cell is empty or not

        if(board[row][column]!='.'){  //not empty
            if(helper(board, newrow, newcol)){   //move to next cell
                return true;
            }
        }else {    // empty space found (put a value)
            for(int i=0;i<9;i++){
                if(isSafe(board,row,column,i)){   // check if it's safe to put this a value there
                    board[row][column]=(char)(i+'0');  // put value
                    if(helper(board, newrow, newcol)){    // again check if the num we put is valid or not 
                        return true;
                    } else{
                        board[row][column]='.';        // if it's not valid then put null 
                    }
                }
            }
        }
        return false;
    }


    // solvesudoku
    public void solvesudoku(char [][]board){
        helper(board, 0, 0);
    }
    

    @Override
    public String toString() {
        return "solveSudoku []";
    }}
