package collections;

public class ImplementingQueue {

    private int maxSize;
    private int front;
    private int rear;
    private int[] arrQueue;
    private int items;

    public ImplementingQueue(int size){
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.arrQueue = new int[maxSize];
        this.items = 0;
    }

    public boolean isEmpty(){
        return items == 0;
    }

    public boolean isFull(){
        return items == maxSize;
    }
    
    public void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(rear == maxSize-1){
            rear = -1;
        }
        arrQueue[++rear] = value;
        items++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = arrQueue[front++];
        if(front == maxSize){
            front = 0;
        }
        items--;
        return temp;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arrQueue[front];
    }

    public static void main(String[] args) {
        ImplementingQueue queue = new ImplementingQueue(2);

        queue.dequeue(); //trying to remove a front itemn from an empty queue

        System.out.println(queue.peek());

        queue.enqueue(23); //adiing an item at the end
        queue.enqueue(34);
        queue.enqueue(45);
        
        queue.dequeue();

        System.out.println(queue.peek());
    }
}
