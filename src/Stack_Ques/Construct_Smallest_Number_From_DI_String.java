package Stack_Ques;
import java.util.*;
public class Construct_Smallest_Number_From_DI_String {
    public static void main(String[] args) {
        String s= "IIIDIDDD";
        System.out.println(smallest_no(s));
    }
    public static String smallest_no(String s) {
        int[] arr= new int[s.length()+1];
        Stack<Integer> st= new Stack<>();
        int count=1;
        for(int i=0;i<=s.length();i++){
            if(i==s.length()||s.charAt(i)=='I'){
                arr[i]=count;
                count++;
                while(!st.isEmpty()){
                    arr[st.pop()]=count;
                    count++;
                }
            }else{
                st.push(i);
            }

        }
        String ans= "";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}
