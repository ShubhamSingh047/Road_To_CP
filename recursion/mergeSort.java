
import java.util.*;

public class mergeSort {

    static void mergeSorted(int arr[], int low, int mid, int high){
        List<Integer> list=new ArrayList<>();
        int h2=mid+1, i=low;
        while(low<=mid&& h2<=high){
            if(arr[low]<arr[h2]){
                list.add(arr[low++]);
            }else{
                list.add(arr[h2++]);
            }
        }
        while(h2<=high){
            list.add(arr[h2++]);
        }
        while(low<=mid){
            list.add(arr[low++]);
        }
        for(int x:list){
            arr[i++]=x;
        }
    }

    static void devideAndConcure(int []arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        devideAndConcure(arr, low, mid);
        devideAndConcure(arr, mid+1, high);
        mergeSorted(arr, low, mid, high);
    }
    public static void main(String[] args) {
        int []arr={5,4,1,2,6,7,8,1,2,1};
        devideAndConcure(arr, 0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
