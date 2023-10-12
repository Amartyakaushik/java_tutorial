import java.util.Scanner;

public class Bubblesort{
    //function to print whole array
public static void printarr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
}
    public static void main(String args[]){
        int arr[]={7,8,3,1,2};
        // //1-Bubble sort
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         //swap
        //         if(arr[j]>arr[j+1]){
        //             int temp= arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //         }
        //     }
        // }
        // printarr(arr);

        // //2-Selection sort
        // for(int i=0;i<arr.length-1;i++){
        //     //smallest
        //     int smallest=i;
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[smallest]>arr[j]){  //1st>2nd(true) ,2nd>3rd(false), 2ndrd>4th(True)
        //             smallest=j;            // 1st =2nd ,      2nd=2nd ,     then3rd=4th
        //         }
        //     }
        //     //swap
        //     int temp=arr[smallest]; //arr[smallest] is arr[j]
        //     arr[smallest]=arr[i];   //arr[i] value after update will be +1 so reassigned to smallest for next iteration
        //     arr[i]=temp;
        // }
        // printarr(arr);


        //3-Insertion sort
        //to sort the  Insorted part of the array
        for(int i=1;i<arr.length;i++){
            //the value which we are going to check
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            //for placement of smallest
            arr[j+1]=current;
        } 
        printarr(arr);


        }

    }
