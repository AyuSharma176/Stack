package Stack_Ques;
import java.util.*;
public class Largest_rectangle_in_histogram {
    public static void main(String[] args) {
        int[] arr= {2,3,5,4,6,3,7};
        System.out.println(largestRectangle(arr));
    }
    public static int largestRectangle(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            // int r=arr.length;
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                int h=arr[stack.pop()];
                int r=i;

                if(stack.isEmpty()){
                    int area=h*r;
                    max=Math.max(max,area);
                }
                else {
                    int l = stack.peek();
                    int area = h * (r - l - 1);
                    max = Math.max(max, area);
                }
            }
            stack.push(i);
        }
        int r=arr.length;
        while(!stack.isEmpty()){
            int h=arr[stack.pop()];
            // int r=i;

            if(stack.isEmpty()){
                int area=h*r;
                max=Math.max(max,area);
            }
            else {
                int l = stack.peek();
                int area = h * (r - l - 1);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
