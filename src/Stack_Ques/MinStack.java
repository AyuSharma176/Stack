package Stack_Ques;
import java.util.*;
public class MinStack   {
    Stack<Integer> s;
    Stack<Integer> min;
    public MinStack() {
        s= new Stack<>();
        min= new Stack<>();
    }

    public void push(int val) {
        s.push(val);
        if(min.isEmpty() || min.peek()>=s.peek()){
            min.push(val);
        }
    }

    public void pop() {
        if(!s.isEmpty()){
            int val=s.pop();
            if(val==min.peek()){
                min.pop();
            }
        }
    }

    public int top() {
        if(s.isEmpty()){
            return -1;
        }
        return s.peek();
    }

    public int getMin() {
        if(min.isEmpty()){
            return -1;
        }
        return min.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr= {"push","push","push","getMin","pop","top","getMin"};
        MinStack obj = new MinStack();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("push")){
                obj.push(sc.nextInt());
            }else if(arr[i].equals("pop")){
                obj.pop();
            }else if(arr[i].equals("getMin")){
                System.out.println(obj.getMin());
            }else if(arr[i].equals("top")){
                System.out.println(obj.top());
            }
        }

    }
}
