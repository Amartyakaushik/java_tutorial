//Class -> collection of data and methods
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("I'm writing.");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}


public class BasicOOP {
    public static void main(String args[]){
    //Object -> used to access data and methods from any class
    // className objectName= new constructor
        pen p1=new pen();     //here Pen() is a default constructor
        p1.color="Blue";
        p1.type="Gel";

        p1.write();
        p1.printColor();
        System.out.println(p1.type);
    }
}
