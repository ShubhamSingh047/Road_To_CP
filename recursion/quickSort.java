

import java.util.*;

public class quickSort {

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int []arr, int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot&&i<high)i++;
            while(arr[j]>pivot&&j>low)j--;
            if(i<j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    static void quickSortFun(int[] arr, int low, int high){
        if(low>=high)return;
        int pivot = partition(arr, low, high);
        quickSortFun(arr,low,pivot-1);
        quickSortFun(arr,pivot+1,high);
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,7,6,5};
        quickSortFun(arr,0,arr.length-1);
        for(int x:arr)System.out.print(x+" ");
    }
}
