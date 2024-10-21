import java.util.*;

public class SubSetString {
    static void findSubSet(String str, int i,String curr){
        if (i == str.length()) {
            System.out.println(curr);
            return;
        }
        findSubSet(str, i + 1,curr);
        findSubSet(str, i + 1,curr+str.charAt(i));
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.nextLine();
        findSubSet(str,0,"");
    }
}
