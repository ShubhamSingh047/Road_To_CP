

import java.util.*;

public class StringPalindrom {

    static boolean checkPalindrom(String str,int i, int j) {
        if(i>=j)return true;
        return (str.charAt(i)==str.charAt(j)) && checkPalindrom(str,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the string you want to check palindrom :-");
        String str= s.nextLine();
        int i=0, j=str.length()-1;
        boolean res=checkPalindrom(str,i,j);
        System.out.println(res+" res");
    }

    
}
