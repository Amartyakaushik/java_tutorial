
    class Student{
        String name;
        int Roll;
        int age;
    

        //1) Overriding
        public void  printinfo(String naam){
            this.name=naam;
            System.out.print("name: ");
            System.out.println(naam);
        }

        public void printinfo(){
            System.out.print("roll number of ");
            System.out.print(this.name);
            System.out.print(" is ");
            System.out.println(this.Roll);
        }
        
        public void  printinfo(int Age){
            this.age=Age;
            System.out.print("Age: ");
            System.out.println(Age);
        }

    }

    //extend keyword is used to inherit base class to sub class
    class House extends Student{
        //overriding
        public void printinfo(){
        System.out.print("roll number of ");
        System.out.print(this.name);
        System.out.print(" is ");
        System.out.print(this.Roll);
        System.out.print(" is  and is ");
        System.out.print(age);
        System.out.println(" years old");
        }

        //Constructor
        House(String naam,int umar,int roll){
            this.name=naam;
            this.age=umar;
            this.Roll=roll;
        }
    }

public class Polymorphism {
    /*  there are two types of polymorphism
    1) overriding
    2) overloading 
    */
public static void main(String args[]){
    Student s1=new Student();
    s1.name="Amartya";
    s1.age=20;
    s1.Roll=13;

    //overloading
    s1.printinfo();
    s1.printinfo(34);
    s1.printinfo("Charchil");

    //ovrerriding
    House s2=new House("Chandu",23,12);
    s2.printinfo();
}
    
}
