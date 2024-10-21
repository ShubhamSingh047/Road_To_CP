import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,7};
        System.out.println(finMax(arr,0));
        System.out.println(finMin(arr,0));
    }

    private static int finMin(int[] arr,int i) {
       if(arr.length==i){
        return Integer.MAX_VALUE;
       }
       return Math.min(arr[i],finMin(arr,i+1));
    }

    private static int finMax(int[] arr,int i) {
       if(arr.length==i)return Integer.MIN_VALUE;
       return Math.max(arr[i],finMax(arr,i+1));
    }
}
