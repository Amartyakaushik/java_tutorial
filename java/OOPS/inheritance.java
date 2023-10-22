
class College{
    String name;
    String collegeName;

}
//single level
class Student extends College{
    public void printinfo(){
        System.out.print(name);
        System.out.print(" took admission in ");
        System.out.println(collegeName);
    }
}
//heirarchial
class Faculty extends College{
    String department;
    Faculty(String departmentAlloted){
        this.department=departmentAlloted;
    }
}


//multlilevel 
class House extends Student{
    String house;
    public void show(){
        System.out.print(name);
        System.out.print(" is in ");
        System.out.println(house);

    }
    House(String houseName){
        this.house=houseName;
    }
}

//Hybrid
class batch extends Student{
    String batchNo;
    batch(String batch){
        this.batchNo=batch;
    }

    public void displalybatch(){
        System.out.print(name);
        System.out.print(" is in ");
        System.out.println(batchNo);
    }
}

public class inheritance {
    /*There are four types of inheritence 
    1) single level
    2)multilevel
    3)hierarchial
    4)Hybrid
     */

    public static void main(String args[]){
        Student sd1=new Student();
        sd1.name="Chandbar lal";
        sd1.collegeName="LPU";
        sd1.printinfo();

        House sd2=new House("Pratap House");
        System.out.println(sd2.house);

        //Heirarchial
        Faculty f1=new Faculty("H.O.D");
        System.out.println(f1.department);

        //Hybrid
        batch std3=new batch("K22DR");
        std3.displalybatch();


    }
}
