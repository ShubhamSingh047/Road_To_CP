import java.util.ArrayList;
import java.util.List;

public class RatInMaze {

    static void helperFUnction(int i, int j, int [][]arr, String ds, List<String> ans){
        int n=arr.length;
        int m=arr[0].length;
        
        if(i<0||i>=n||j<0||j>=m){
            return;
        }
        if(arr[i][j]==0)return;
        if(i==n-1&&j==m-1){
            ans.add(ds);
            return;
        }

        arr[i][j]=0;

        //Down
        helperFUnction(i+1,j,arr,ds+"D",ans);

        //left
        helperFUnction(i, j-1, arr, ds+"L", ans);

        //Right
        helperFUnction(i,j+1,arr,ds+"R",ans);

        //Up
        helperFUnction(i-1, j, arr, ds+"U", ans);

        arr[i][j]=1;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int i=0,j=0;
        String ds="";
        ArrayList<String> ans=new ArrayList<>();
        helperFUnction(i,j,mat,ds,ans);
        System.out.println(ans);
    }
}
