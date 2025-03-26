package Stack_Ques;
import java.util.*;
public class Next_greatest {
    public static void main(String[] args) {
        int[] arr= {55,11,9,7,13,3,66,60};
        int[] ans=new int[arr.length];
        nextGreatest(arr,ans);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] nextGreatest(int[] arr,int[] ans) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            while (!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
                ans[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            ans[stack.pop()]=-1;
        }
        return ans;
    }
}
