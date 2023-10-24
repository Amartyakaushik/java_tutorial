package OOPS;

public class BasicsOfOOPs {
    //Class -> collection of data and methods
class Pen{
    String color;
    String type;
    
    public void write(){
        System.out.println("I'm writing.");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

    public static void main(String args[]){
        //Object -> used to access data and methods from any class
    // className objectName= new constructor
        Pen p1=new Pen();    //here Pen() is a default constructor
        p1.color="Black";
        p1.type="Gel";
        p1.write();
        p1.printColor();
        // System.out.println(p1.type);
        
    }
    
}
