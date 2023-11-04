import java.util.Scanner;
import java.util.*;
public class Strings{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // // 1-Input
        // System.out.print("Enter ur first name: ");d
        // String firstname=sc.next();
        // System.out.print("Enter ur last name: ");
        // String lastname=sc.next();
        // // String s1=sc.nextLine();
        // System.out.println(firstname);
        // System.out.println(lastname);

        // //2-Concatination
        // String fullname=firstname+lastname;
        // System.out.print("Your full name: ");
        // System.out.println(fullname);

        //length
        String fullname="Amartya Kaushik";
        System.out.println(fullname.length());

        //charAt
        System.out.println(fullname.charAt(8));

        // //3-Compare
        String s1="Tony";
        String s2="Tony";
        // if(s1.compareTo(s2)){
        //     System.out.println("both are same");
        // }

        //4-Substring
        String s3=s1.substring(0,3);
        System.out.println(s3);   //Ton


        String s="Amar Rana";
        int res=indexOf("ar");
        System.out.println(res);
    }

}
