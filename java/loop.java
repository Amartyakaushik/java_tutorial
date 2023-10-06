import java.util.Scanner;
public class loop{
    public static void main(String[] args){
        //LOOP
        Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n: ");
        int n=sc.nextInt();
        // //1
        // //outer loop
        // for(int i=1;i<=5;i++){
        //     //inner loop
        //     for(int j=1;j<=n;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

      //  //2
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=n;j++){
        //         if(i==1||i==n||j==1||j==n){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // //3
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //4
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // //5
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //         //for space
        //         for(int k=1;k<=n-i+1;k++){
        //             System.out.print(" ");
        //         }
        //         for(int l=1;l<=i;l++){
        //             System.out.print("*");
        //         }
        //     System.out.println();
        // }

        // //6
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // //7
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=n-i+1;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // //8
        // int num=1;
        // //outer loop
        // for(int i=1;i<=n;i++){
        //     //inner loop
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }


        //9
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
