package Stack_Ques;

import java.util.Stack;

public class Reverse_STACK {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Reverse(stack);
        System.out.println(stack);
    }
    public static void Reverse(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int it=stack.pop();
        Reverse(stack);
        insertButton(stack,it);
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
