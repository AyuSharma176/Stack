package Stack_Implementation;
public class Stack{
    private int[] arr;
    private int tos;

    Stack(){
        arr = new int[5];
        tos=-1;
    }
    Stack(int n){
        arr = new int[n];
        tos=-1;
    }
    public boolean isFull(){
        return tos==arr.length-1;
    }
    public void push(int x) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full");
        }
        arr[++tos]=x;
    }
    public int pop() throws Exception{
        if(tos==-1){
            throw new Exception("Stack is empty");

        }
        return arr[tos--];
    }
    public int top() throws Exception{
        if(tos==-1){
            throw new Exception("Stack is empty");
        }
        return arr[tos];
    }
    public int size(){
        return tos+1;
    }
    public void display(){
        for(int i=tos;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}

