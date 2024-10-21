
import java.util.*;

public class SubSeqSumK {

    static void printSubSeqK(int arr[],int i, List<Integer> list, int k){
        if(i==arr.length){
            int sum=0;
            for(int j:list){
                sum+=j;
            }
            if(k==sum){
                System.out.println(list);
            }
            return;
        }

        list.add(arr[i]);
        printSubSeqK(arr, i+1, list, k);
        list.remove(list.size()-1);
        printSubSeqK(arr, i+1, list, k);
    }

    public static void main(String[] args) {
        int[] arr={1,2,1};
        int i=0, k=2;
        List<Integer> cont=new ArrayList<>();
        printSubSeqK(arr,i,cont,k);
    }
}
