import java.util.Scanner;
public class Function{
//Funtion
//1
public static void sum(int n,int k){
    System.out.print("summation: ");
    System.out.println(n+k);
    return;
}

//2
public static void mul(int n,int k){
    System.out.print("Multiplication: ");
    System.out.println(n*k);
    return;
}

//3
public static void findfactorialof(int n){
    int factorial=1;
    if(n<0){
        return;
    } else if(n==0){
        System.out.print("Factorial of 0 is: 1");
    }else{
        System.out.print("Factorial: ");
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
    
}
//MAIN FUNCTION
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        //1
        // System.out.print("enter value of n: ");
        // int n=sc.nextInt();
        // System.out.print("Enter value of b: ");
        // int b=sc.nextInt();
        // sum(n,b);

       // //2
        // System.out.print("Enter value of a: ");
        // int a=sc.nextInt();
        // System.out.print("Enter value of b: ");
        // int b=sc.nextInt();
        // mul(a,b);.

        //3
        System.out.print("Enter value to find factorial: ");
        int a=sc.nextInt();
        findfactorialof(a);
    }
}
