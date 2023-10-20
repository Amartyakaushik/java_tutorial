public class QuickSort {
    public static int Partition(int arr[],int low,int high){
        int pivot=arr[high];
        // here i is the new space to put the values
        int i=low-1;

        // now check each element if it's smalller or greater than pivot
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                //new space updatation
                i++;
                //swap the new space with smaller value
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap values to update pivod index
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }


    public static void quickSort(int arr[],int low,int high){
        if(arr[low]<arr[high]){
            int pivotIndex=Partition(arr,low,high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }


    public static void main(String args[]){
        int var[]={6,3,9,5,2,8};
        int n=var.length;

        for(int i=0;i<n;i++){
            System.out.print(var[i]);
        }
        // System.out.println();
    }

}
