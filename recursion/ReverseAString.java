public class ReverseAString {

    public static void main(String[] args) {
        String str = "Hello World";
        ReverseString(str,0);
    }
    private static void ReverseString(String str, int i) {
        if(str.length()==i)return;
        ReverseString(str,i+1);
        System.out.print(str.charAt(i)+" ");
    }
}
