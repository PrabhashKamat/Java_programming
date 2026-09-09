package Stacks;
import java.util.Stack;

public class PushatBottom {
    public static void main(String[] arg){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int ele=50;
        pushatbottom(st,ele);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    private static void reverse(Stack<Integer> st) {
        if(st.size()<=1) return;
        int top = st.pop();
        reverse(st);
        pushatbottom(st,top);
    }

    private static void pushatbottom(Stack<Integer> st, int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushatbottom(st,ele);
        st.push(top);
    }
}
