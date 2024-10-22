import java.util.*;

public class CombinationSum2 {

    static void findSum(int[] arr, int i, List<Integer> ds, List<List<Integer>> ans,int target){
        if(arr.length==i)return;
        if(target<0)return;
        if(target==0){
            ans.add(new ArrayList(ds));
            return;
        }
        ds.add(arr[i]);
        findSum(arr, i+1, ds, ans, target-arr[i]);
        ds.remove(ds.size()-1);
        findSum(arr, i+1, ds, ans, target);
    }

    public static void main(String[] args) {
        int arr[]={10,1,2,7,6,1,5};
        Arrays.sort(arr);
        List<List<Integer>> list= new ArrayList<>();

        List<Integer> ds = new ArrayList<>();
        
        int i=0, target=8;

        findSum(arr,i,ds,list,target);

        System.out.println(list);

    }
}
