import java.util.*;

public class CombinationSum {

    static void CombinationSum(int i, int[] arr, List<List<Integer>> ans,int target,List <Integer> ds){
        if(i==arr.length)return;
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(target<0)return;
        ds.add(arr[i]);
        CombinationSum(i, arr, ans, target-arr[i], ds);
        ds.remove(ds.size()-1);
        CombinationSum(i+1, arr, ans, target, ds);
    }

    public static void main(String[] args) {
        List<List<Integer>> list=new ArrayList<>();
        int arr[]={2,3,6,7};
        int target=7 , index=0;

        CombinationSum(index,arr,list,target,new ArrayList<>());
        System.out.println(list);
    }
}
