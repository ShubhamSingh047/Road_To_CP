import java.util.*;

public class RopeCutting {
    static int findMaxRope(int size_of_rope, int a, int b, int c){
        if(size_of_rope==0){
            return 0;
        }
        if(size_of_rope<0)return -1;
        int res= Math.max(findMaxRope(size_of_rope-a, a, b, c),Math.max(findMaxRope(size_of_rope-b, a, b, c),findMaxRope(size_of_rope-c, a, b, c)));

        if(res==-1)return -1;
        return res+1;
    }
    public static void main(String[] args) {
        int size_of_rope=5;
        int a=2;
        int b=5;
        int c=1;
        System.out.println(findMaxRope(size_of_rope,a,b,c));
    }
}
