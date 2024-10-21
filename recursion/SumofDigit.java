import java.util.*;

public class SumofDigit {

    static int findSum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + findSum(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digit you want to sum");
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }
}
