package strukturdata.linear;

public class Queue {
    private Object[] data;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public Queue(int size) {
        data = new Object[size];
        capacity = size;
        rear = -1;
        front = 0;
        count = 0;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public void enqueue (Object x){
        if (isFull()){
            System.out.println("\n Queue Penuh!!!");
        } else {
            System.out.println("\nMemasukkan " + x + " Ke dalam queue");
        }
    }

    public Object dequeue(){
        if (isEmpty()){
            System.out.println("\nQueue Kosong !!!");
        }
        Object x = data[front];
        System.out.println("\nMengeluarkan " + x + " Dari queue");
        front = (front + 1) % capacity;
        count--;
        return x;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("\nQueue kosong !!!");
        } else{
            System.out.println("\nData dalam queue : ");
            for (int i = 0; i < count; i++){
                System.out.println(data[(front + i) % capacity] + " " );
            }
            System.out.println();
        }
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("\nQueue kosong!!!");
        } else{
            System.out.println("Elemen depan : " + data[front]);
        }
    }

    public void count(){
        System.out.println("\nJumlah data dalam queue : " + count);
    }
}
