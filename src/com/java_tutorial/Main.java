<<<<<<< HEAD
////package com.java_tutorial;
public class main{
    public static void main(string[] args){
        System.out.println("Hello World");
    }
}


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
    }
//}
=======
package com.java_tutorial;
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
//        //Variables
//        String name="Abhi";
//        int age=23;
//        String brother=name;

//        // JAVA TYPES
//        //1) PRIMITIVE (storing simple values,limited values are valid)
//        /*BYTE - 1
//        SHORT - 2
//        INT - 4
//        FLOAT - 4
//        LONG - 8
//        DOUBLE - 8
//        * */
        byte age=23;
        int phone=1234567890;
        long phone2=1234567900L;
        float pi=3.14F;
        boolean isAdult=false;
        char letter = '@';

        //2)NON-PRIMITIVE/REFERENCE TYPE  (storing complex values,no limitation for the values)
        String name="Abhi";
        System.out.println(name.length());
        String friend=new String("Allu");

        //STRING (Immutable)
        //1)Concatenate
        String name1="Aman";
        String name2="Amartya";
        String name3=name1+" and " +name2;
        System.out.println(name3);

        //2)charAt
        System.out.println(name.charAt(1));

        //3)Length
        System.out.println(name.length());

        //4)replace
        String new_name=name2.replace('a','b');
        System.out.println(new_name);

        //5)Substring
        String brothers= "Abhi and Aman and Kunmun";
        System.out.println(brothers.substring(0,4));
        System.out.println(brothers.substring(9,13));

        //ARRAY
        int[] marks=new int[3];
        int[] cgpa=new int[5]; //Garbage value - 0
        boolean[] age=new boolean[3];  //Garbage value - True/False
        marks[0]=98;
        marks[1]=97;
        marks[2]=54;
        System.out.println(marks[2]);
        System.out.println(cgpa[2]);
        System.out.println(age[1]);
    }
}
>>>>>>> 7056c0b (update)
