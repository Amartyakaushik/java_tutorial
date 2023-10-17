import java.util.Scanner;
public class Recursion {

    //Q1- print numbers from n to 1
    public static void printnum(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    //Q-2 print sum of first n natural numbers
    public static void printsum(int i,int n,int sum){
        // int sum=0;
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i+1,n,sum);
    }

    // //Q3-find the factorial of a number 'a'.
    public static int fact(int n){
        if(n<1){
            return 1;
        }
        int fact_n= n* (fact(n-1));
        // System.out.println( n*(fact(n-1)));
        return fact_n;
    }

    //Q4- find the fabonacci series of number 'a'.
    public static int fabnac(int n){
        if(n<1){
            return 1;
        }
        int fab_n=fabnac(n-1)+fabnac(n-2);
        return fab_n;
    }

    //MAIN FUNCTION
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("numbers are ");
        printnum(a);

        //Summation
        System.out.println("sum of first $a natural numbers is ");
        printsum(1,a,0);

        //factorial
        System.out.println("Factorial of $a is ");
        System.out.println(fact(5));

        //Fabonacci
        System.out.println("fabonacci series of a is ");
        System.out.println(fabnac(a));
    }
}
