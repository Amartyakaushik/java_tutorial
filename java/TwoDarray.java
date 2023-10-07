import java.util.Scanner;
public class TwoDarray{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter row: ");
    int row=sc.nextInt();
    System.out.print("Enter column: ");
    int col=sc.nextInt();
    int matrix[][]=new int[row][col];

    System.out.println("Enter matrix value: ");
    //for input
    //for row
    for(int i=0;i<row;i++){
        //for column
        for(int j=0;j<col;j++){
            matrix[i][j]=sc.nextInt();
        }
        System.out.println();
    }

    System.out.println("Here's your matrix: ");
    //for output
    //for row
    for(int i=0;i<row;i++){
        //for column
        for(int j=0;j<col;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }

    //Take a matrix as input from the user search for a given number x
    // and print the indices at which it occurs
    System.out.print("Enter value to find: ");
    int x=sc.nextInt();
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(matrix[i][j]==x){
                System.out.println("index of "+x+" = "+"("+(i+1)+","+(j+1)+")");
            }
        }
    }

    }

}