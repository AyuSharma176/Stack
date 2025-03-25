package Stack_Ques;

import java.util.*;

public class Insert_Button {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        insertButton(stack,-9);
        System.out.println(stack);
    }
    public static void insertButton(Stack<Integer> stack,int item) {
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int it=stack.pop();
        insertButton(stack,item);
        stack.push(it);
    }
}
