package Stack_Ques;

import java.util.*;
public class Max_diff {
    public static void main(String[] args) {
        int[] arr = {71,76,63,93,60,68,60,46,67,63};
        System.out.println(max_diff(arr));
    }
    public static int max_diff(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                left[i] = arr[st.peek()];
            } else {
                left[i] = 0;
            }
            st.push(i);
        }


        st.clear();


        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                right[i] = arr[st.peek()];
            } else {
                right[i] = 0;
            }
            st.push(i);
        }


//         for (int i = 0; i < n; i++) {
//             System.out.print(left[i] + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < n; i++) {
//             System.out.print(right[i] + " ");
//         }
//         System.out.println();

        int max_ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(left[i] - right[i]);
            if (diff > max_ans) {
                max_ans = diff;
            }
        }

        return max_ans;
    }
}
