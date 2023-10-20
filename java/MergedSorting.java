public class MergedSorting {
    //Conquer class
    public static void Conquer(int arr[],int si,int mid,int ei){
        mid= si+(ei-si)/2;
        //creating an empty array to put the sorted in it
        int merged[]=new int[ei-si+1]; // here (ei-si+1) is the length of the merged array
        int index1=si;
        int index2=mid+1;
        int x=0;
 
        // loop to compare each and every index value of both arrays cosecutivly
        while(index1<=mid && index2<=ei){
        //now check the smallest value among both arrays (after division)
            if(arr[index1]< arr[index2]){
                merged[x++]=arr[index1];
            } else{
                merged[x++]=arr[index2];
            }
        }

        //when either of the array's index reach it's ending index then force the another array's index to continue sorting till it's ending index
        while(index1<=mid){
            merged[x++]=arr[index1];
        }
        
        while(index2<=ei){
            merged[x++]=arr[index2];
        }

        //now copy the merged sorted array to original array
        int j=si;
        for(int i=0;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

    //Divide class
    public static void Divide(int arr[],int si,int ei){
        int mid=si+(ei-si)/2;
        Divide(arr,si,ei);
        Divide(arr,mid+1,ei);
        Conquer(arr,si,mid,ei);
    }
    public static void main(String args[]){
        int var[]={6,3,9,5,2,8};
        int n=var.length;
        Divide(var,0,n-1);
        
        for(int i=0;i<n;i++){
            System.out.println(var[i]+" ");
        }
        System.out.println();
    }
        
    }

