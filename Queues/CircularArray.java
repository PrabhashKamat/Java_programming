package Queues;
class CircularQueue{
    private final int[] arr;
    private int front;
    private int rear;
    int size;

    CircularQueue(int capacity){
        arr = new int[capacity];
    }
    void add(int value){
        if(size ==arr.length){
            System.out.println("Queue is Full!");
            return;
        }
        arr[rear++] = value;
        if(rear == arr.length) rear = 0;
        size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int FrontVal = arr[front];
        front++;
        if(front==arr.length) front = 0;
        size--;
        return FrontVal;
    }

    int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }
    void display(){
        if(size==0) return;
        if(front>=rear){
            for(int i=front;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0;i<rear;i++){
                System.out.println(arr[i]+" ");
            }
        }
        else{
            for(int i=front;i<rear;i++ ){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}

public class CircularArray{
    public static void main(String[] arg){
        CircularQueue q = new CircularQueue(4);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.remove());
        q.add(50);
        q.display();
    }
}
