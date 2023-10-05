 /**
  * Hello
  */
//  package com.java;
import java.util.Scanner;
 public class Hello {
    public static void main(String[] args) {
                      //OUTPUT
        System.out.print("Hello world");
        //println
        System.out.println("How are you");
        //"\n"
        System.out.print("Be safe\n");
           
                      //VARIABLES
        int a=4;
        int b=5;
        int sum=a+b;
        System.out.println(sum);

        String name="Amartya";
        System.out.println(name);

        double x=23.23;
        System.out.println(x);

                       //INPUTS
        Scanner sc = new Scanner(System.in);
        String title=sc.nextLine();
        System.out.println(title);
        
    }
 }