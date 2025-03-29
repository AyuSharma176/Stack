package Stack_Ques;
import java.util.*;
public class MinStack_O1 {
    Stack<Integer> s;
    int min;
    public MinStack_O1() {
        s= new Stack<>();
        min= Integer.MAX_VALUE;
    }

    public void push(int val) {
        if(val<=min){
            s.push(min);
            min=val;
        }
        s.push(val);
    }

    public void pop() {
        if(s.pop()==min){
            min=s.pop();
        }

    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr= {"push","push","push","getMin","pop","top","getMin"};
        MinStack_O1 obj = new MinStack_O1();
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
