package com.java_tutorial;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
////        //Variables
////        String name="Abhi";
////        int age=23;
////        String brother=name;
//
////        // JAVA TYPES
////        //1) PRIMITIVE (storing simple values,limited values are valid)
////        /*BYTE - 1
////        SHORT - 2
////        INT - 4
////        FLOAT - 4
////        LONG - 8
////        DOUBLE - 8
////        * */
//        byte age_=23;
//        int phone=1234567890;
//        long phone2=1234567900L;
//        float pi=3.14F;
//        boolean isAdult=false;
//        char letter = '@';
//
//        //2)NON-PRIMITIVE/REFERENCE TYPE  (storing complex values,no limitation for the values)
//        String name="Abhi";
//        System.out.println(name.length());
//        String friend=new String("Allu");
//
//        //STRING (Immutable)
//        //1)Concatenate
//        String name1="Aman";
//        String name2="Amartya";
//        String name3=name1+" and " +name2;
//        System.out.println(name3);
//
//        //2)charAt
//        System.out.println(name.charAt(1));
//
//        //3)Length
//        System.out.println(name.length());
//
//        //4)replace
//        String new_name=name2.replace('a','b');
//        System.out.println(new_name);
//
//        //5)Substring
//        String brothers= "Abhi and Aman and Kunmun";
//        System.out.println(brothers.substring(0,4));
//        System.out.println(brothers.substring(9,13));

        //ARRAY
        int[] marks=new int[3];
        int[] cgpa=new int[5]; //Garbage value - 0
        boolean[] age =new boolean[3];  //Garbage value - True/False
        marks[0]=98;
        marks[1]=97;
        marks[2]=54;
        System.out.println(marks[2]);
        System.out.println(cgpa[2]);
        System.out.println(age[1]);

        //Length
        System.out.println("\nlength of the array is- ");
        System.out.println(marks.length);//here length is not a function but it self a property of  arrray

        //Short
        System.out.println("\nAFTER SORTING...");
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        //2D Arrays
        System.out.println("\n2D ARRAYS...");
        int final_marks[][]={{98,34,43},{48,97,56}};
        System.out.println(final_marks[0][1]);
        System.out.println(final_marks[1][1]);

        //TYPE CASTING
        //1) Implicit casting -- {int - double}
        double price=200.00;
        double f_price=price+18;
        System.out.println(f_price);

        //2)Explicit casting-- {double - int}
        int p=120;
        int final_p=p+(int)21.6;
        System.out.println(final_p);//{(int)21.6}...
    }
}
