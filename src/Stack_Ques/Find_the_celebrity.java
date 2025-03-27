package Stack_Ques;

import java.util.*;

public class Find_the_celebrity {
    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
        System.out.println(celebrity(arr));

    }
    public static int celebrity(int[][] arr) {
        Stack<Integer> st= new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            st.push(i);
        }
        while(st.size()>1) {
            int x = st.pop();
            int y = st.pop();
            if(arr[x][y] == 1){
                st.push(y);
            }else{
                st.push(x);
            }
        }
        int cand=st.pop();
        for(int i=0;i<arr.length;i++){
            if(i==cand){
                continue;
            }
            if(arr[cand][i]!=0 || arr[i][cand]==0){
                return -1;
            }
        }
        return cand;
    }
}
