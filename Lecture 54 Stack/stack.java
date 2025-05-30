import java.util.*;

public class stack {
    public static void main(String[] args) {
        int[] arr =new int[5];
        Stack<Integer> st=new Stack<>();
        System.out.println(st);

        st.push(1);
        st.push(23);
        st.push(13);
        st.push(31);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);

        System.out.println(st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);







    }
}
