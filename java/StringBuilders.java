import java.util.Scanner;
public class StringBuilders{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //StringBuilder
        StringBuilder name=new StringBuilder("Tony");
        //all operations same as string type can be performed here
        //1-setCharAt
        name.setCharAt(0,'P');
        System.out.println(name);   //pony

        //2-insert
        name.insert(1,'o');
        System.out.println(name);   //Poony

        //3-delete
        name.delete(1,2);
        System.out.println(name);    //Pony

        //4-append
        name.append(' ');
        name.append('S');
        name.append('t');
        name.append('a');
        name.append('r');
        name.append('k');
        System.out.println(name);  //pony stark
        name.setCharAt(0,'T');
        System.out.println(name);    ///Tony Stark



        //Q-Reverse string
        StringBuilder naam=new StringBuilder("HELLO");
        for(int i=0;i<naam.length()/2;i++){
            int front=i;         //0,1,2
            int back=naam.length()-1-i;   //4,3

            char frontchar=naam.charAt(front);
            char backchar=naam.charAt(back);

            naam.setCharAt(front,backchar);
            naam.setCharAt(back,frontchar);
        }
        System.out.println(naam);


    }

}