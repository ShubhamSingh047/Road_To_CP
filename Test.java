import java.util.*;

class Test{

    public static void printName(int n){
        if(n<=0){
            return;
        }
        System.out.println("Shubham "+n);
        printName(n/2);
        printName(n/2);
    }

    public static void main(String[] args) {
        System.out.println("print name n time:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printName(n);
    }
}