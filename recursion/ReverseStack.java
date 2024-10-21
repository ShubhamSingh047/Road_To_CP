import java.util.*;

public class ReverseStack {

    static Stack<Integer> reverseStack(Stack<Integer> stack, Stack<Integer> st){
        if(stack.isEmpty())return st;
        st.push(stack.pop());
        return reverseStack(stack,st);
    }

    static void insertAtBottom(Stack<Integer> stack,int top){
        if(stack.isEmpty()){
            stack.push(top);
            return ;
        }
        int ele=stack.pop();
        insertAtBottom(stack,top);
        stack.push(ele);
    }

    static void reverseStackConstactSpace(Stack<Integer> stack){
        if(stack.isEmpty())return;
        int top=stack.pop();
        reverseStackConstactSpace(stack);
        insertAtBottom(stack,top);
    } 

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5);

        Stack<Integer> stack=new Stack<>();

        stack.addAll(list);

        Stack<Integer> st=new Stack<>();

        // System.out.println(reverseStack(stack,st));

        reverseStackConstactSpace(stack);
        System.out.println(stack);
    }
}
