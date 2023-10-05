 /**
  * Hello
  */
//  package com.java;
import java.util.Scanner;
 public class Hello {
    public static void main(String[] args) {
      //                 //OUTPUT
      //   System.out.print("Hello world");
      //   //println
      //   System.out.println("How are you");
      //   //"\n"
      //   System.out.print("Be safe\n");
           
      //                 //VARIABLES
      //   int a=4;
      //   int b=5;
      //   int add=a+b;
      //   System.out.println(add);

      //   String name="Amartya";
      //   System.out.println(name);

      //   double x=23.23;
      //   System.out.println(x);

      //                  //INPUTS
        Scanner sc = new Scanner(System.in);
      //   String title=sc.nextLine();
      //   System.out.println(title);

      //   int ab=sc.nextInt();
      //   int ba=sc.nextInt();
      //   int sum=ab+ba;
      //   System.out.println(sum);

                    //CONDITIONAL STATEMENT
                    //if else//
      // int age=sc.nextInt();
      // if(age>=18){
      //    System.out.println("Is Adult");
      // }else {
      //    System.out.println("Is child");
      //  }

      // int num=sc.nextInt();
      // if((num%2)==0){
      //    System.out.println("Even");
      // } else{
      //    System.out.println("Odd");
      // }

      // int a=sc.nextInt();
      // int b=sc.nextInt();
      // if(a==b){
      //    System.out.println("Both are equal");
      // } else if(a>b){
      //       System.out.print(a);
      //       System.out.println(" is greater");
      //    } else{
      //       System.out.print(b);
      //       System.out.println(" is greater");
      //    }

      System.out.print("Press button(1,2,3): ");
      int button=sc.nextInt();

      // if(button==1){
      //    System.out.println("Namaste");
      // } else if(button==2){
      //    System.out.println("Hello");
      // } else if(button==3){
      //    System.out.println("Bonjour");
      // } else {
      //    System.out.println("Invalid button");
      // }

                        //SWITCH
      switch(button){
         case 1: {
            System.out.println("Namaste");
            break;
         }
         case 2:{
            System.out.println("Hello");
            break;
         }
         case 3: {
            System.out.println("Bonjour");
            break;
         }
         default: {
            System.out.println("Invalid button");
         }
      }
      
    } 
 }