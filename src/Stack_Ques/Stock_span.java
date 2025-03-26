package Stack_Ques;
import java.util.*;
public class Stock_span {
    public static void main(String[] args) {
        int[] arr= {3,1,6,4,18,7,5,11,19};
        int[] ans =new int[arr.length];
        stockSpan(arr,ans);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] stockSpan(int[] arr,int[] ans) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i]=i+1;
            }
            else {
                ans[i]=i-stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
