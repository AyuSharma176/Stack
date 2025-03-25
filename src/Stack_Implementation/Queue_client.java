package Stack_Implementation;

public class Queue_client {
    public static void main(String[] args) throws Exception{
        Queue q = new Queue();
        q.EnQueue(10);
        q.EnQueue(20);
        q.EnQueue(30);
        q.EnQueue(40);
        q.Display();
        q.DeQueue();
        q.Display();
        q.DeQueue();
        q.Display();
        q.EnQueue(60);
        q.Display();
    }
}
