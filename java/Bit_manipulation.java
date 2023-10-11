import java.util.Scanner;
public class Bit_manipulation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Bit Manipulation
        //  there are four type to manipulate bit
        //  1-get (used to check the bit at specific position)
        //Q Get the 3rd bit(position-2) of a number n=0101;
        int n=5;
        int pos_get=2;
        int bitmask_get=1<<pos_get;

        int new_=bitmask_get & n;
        if(new_==0){
            System.out.println("the bit value is 0 ");
        }else {
            System.out.println("the bit value is 1");
        }

        //  2-set (used to set the bit to "1" at any specific position of binary form
        //   of number)
        //Q Set the 2nd bit(position-1) of a number n=0101;
        int pos_set=1;
        int bitmask_set=1<<pos_set;
        int new_num=bitmask_set | n;

        System.out.println(new_num);

        //  3-clear (used to clear the bit value to "0" at any specific position of 
        //   binary  form of number)

        //  4-update (used to convert the bit value from "0" to "1" or "1" to "0")
         int opt =sc.nextInt();


    }
}