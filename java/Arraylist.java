import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();

        //Add function
        list.add(3);
        list.add(32);
        list.add(342);
        System.out.println(list);

        //Get function
        int list2=list.get(2);
        System.out.println(list2);

        //Add elements in between
        list.add(3,230);
        System.out.println(list);

        //Set elements in between
        list.set(0,90);
        System.out.println(list);

        //Delete elements in between
        list.remove(2);
        System.out.println(list);

        //Size of Arraylist
        int S=list.size();
        System.out.println((S));

        //LOOPs
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();

        //Sorting of Arraylist
        Collections.sort(list);

    }
    
}
