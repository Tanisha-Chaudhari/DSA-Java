public class QueueFundamental {
    int size = 5;
    int items[] = new int[size];
    int front, rear;

    QueueFundamental(){
        front=-1;
        rear=-1;
    }
    boolean isFull(){
        if(front == 0 && rear==size-1){
            return  true;
        }
        return  false;
    }
    boolean isEmpty(){
        if(front==-1)
            return  true;
        else
            return  false;
    }
    void  enqueue(int item){
        if(isFull()){
            System.out.println("OVERFLOW Condition");
        }
        else {
            if(front == -1)
                front=0;
                rear++;
                items[rear] = item;
        }

    }
    void  dequeue(){
        int val;
        if(isEmpty()){
            System.out.println("UNDERFLOW Condition");
        }
        else{
            val = items[front];
            if(front >= rear) //RESET condition
            {
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
            System.out.println("Deleted element: "+ val);
        }
    }
    void display(){
        int i;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else {
            for(i = front; i<=rear;i++){
                System.out.println(items[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        QueueFundamental obj = new QueueFundamental();

        obj.dequeue();
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.dequeue();
        obj.display();
//        obj.enqueue(90);
//        obj.display();
    }
}
