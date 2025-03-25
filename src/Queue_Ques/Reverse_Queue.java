package Queue_Ques;

import Stack_Implementation.Queue;

public class Reverse_Queue {
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        q.EnQueue(10);
        q.EnQueue(20);
        q.EnQueue(30);
        q.EnQueue(40);
        q.EnQueue(50);
        q.Display();
        Reverse(q);
        q.Display();
    }
    public static void Reverse(Queue q) throws Exception {
        if(q.isEmpty()){
            return;
        }
        int it=q.DeQueue();
        Reverse(q);
        q.EnQueue(it);
    }
}
