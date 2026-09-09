package Stacks;
import java.util.Stack;

public class BasicSTLofStacks {
    public static void main(String[] arg) {
        Stack<String> st = new Stack<>();
        st.push("Prabhash");
        st.push("Preet");
        st.push("isha");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());

    }
}
