package Stack_Ques;
import java.util.*;

public class InfixtoPrefix {
    public static void main(String...args){
        String s = "9-5+3*4/6";
        System.out.println(s);
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
//            int ascii = (int)ch;

            if(Character.isDigit(ch)){
                val.push(String.valueOf(ch));
            }
            else if(op.isEmpty()) op.push(ch);
            else{
                if(ch == '-' || ch == '+'){
                    String v2 = val.pop();
                    String v1 = val.pop();
                    if(op.peek() == '-') val.push(op.peek()+v1+v2);
                    if(op.peek() == '+') val.push(op.peek()+v1+v2);
                    if(op.peek() == '*') val.push(op.peek()+v1+v2);
                    if(op.peek() == '/') val.push(op.peek()+v1+v2);
                    op.pop();
                    op.push(ch);
                }
                else if(ch == '*' || ch == '/'){
                    if(op.peek() == '*' || op.peek() == '/'){
                        String v2 = val.pop();
                        String v1 = val.pop();
                        if(op.peek() == '*') val.push(op.peek()+v1+v2);
                        if(op.peek() == '/') val.push(op.peek()+v1+v2);
                        op.pop();
                        op.push(ch);
                    }
                    else op.push(ch);
                }
            }
        }
        while(val.size() > 1){
            String v2 = val.pop();
            String v1 = val.pop();
            if(op.peek() == '-') val.push(op.peek()+v1+v2);
            if(op.peek() == '+') val.push(op.peek()+v1+v2);
            if(op.peek() == '*') val.push(op.peek()+v1+v2);
            if(op.peek() == '/') val.push(op.peek()+v1+v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}