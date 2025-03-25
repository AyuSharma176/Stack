package Stack_Implementation;

public class Queue {
    private int[] arr;
    private int size;
    private int front;

    public Queue(){
        this.arr=new int[5];
        this.size=0;
        this.front=0;
    }
    public Queue(int n){
        this.arr=new int[n];
        this.size=0;
        this.front=0;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public boolean isFull(){
        return this.size==this.arr.length;
    }
    public int size(){
        return this.size;
    }
    public void EnQueue(int item) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }
        int idx=(front+size)%arr.length;
        arr[idx]=item;
        size++;
    }
    public int DeQueue() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int val=arr[front];
        front=(front+1)%arr.length;
        size--;
        return val;
    }
    public int GetFront(){
        int val=arr[front];
        return val;
    }
    public void Display(){
        for(int i=front;i<size;i++){
            int idx= front+i%arr.length;
            System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
}
