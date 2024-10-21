
import java.util.*;

//subsequence can be contigience or non continguese!

class Subsequence{
    static void printSubseq(int []arr,int i,List<Integer> curr){
        if(arr.length==i){
            System.out.println(curr);
            return;
        }
        printSubseq(arr,i+1,curr);
        curr.add(arr[i]);
        printSubseq(arr, i+1,curr);
        curr.remove(curr.size()-1);
    }
    public static void main(String[] args) {
        int[] arr={3,1,2};
        List<Integer> curr=new ArrayList<>();
        int i=0;
        printSubseq(arr,i,curr);
    }
}
