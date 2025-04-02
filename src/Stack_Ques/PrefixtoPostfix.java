package Stack_Ques;
import java.util.*;

public class PrefixtoPostfix {
    public static void main(String...args) {
        String s="-9/*+5346";
        System.out.println(s);
        Stack<String> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                stack.push(ch +"");
            }else{
                String v1=stack.pop();
                String v2=stack.pop();
                String t=v1+v2+ch;
                stack.push(t);
            }
        }
        System.out.println(stack.peek());
    }

}