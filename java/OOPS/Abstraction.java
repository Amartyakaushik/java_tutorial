abstract class industry{
    String title;
    abstract void display();
}

class manager extends industry{
    String department;

    public void display(){
        // this.department=department;
        // this.title=title;
        System.out.print("the manager works as ");
        System.out.print(department);
        System.out.print("  in ");
        System.out.println(title);

    }
}

public class Abstraction {
    public static void main(String args[]){
        manager m1=new manager();
        m1.title="TCS";
        m1.department="Sales manager";
        m1.display();
    }
}



