package strukturdata.linear;

public class stack {
    private int capacity;
    private Object[] data;
    private int top;
    private int count;

    public stack(int size){
        top = -1;
        data = new Object[size];
        capacity = size;
        count = 0;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Object x){
        if (isFull()){
            System.out.println("\nStack penuh");
            0x
        } else {
            System.out.println("\nMemasukkan " + x + " ke dalam stack");
            data[++top] = x;
        }
    }

    public Object pop(){
        if (isEmpty()) {
            System.out.println("\nStack kosong!!!");
            return 0;
        }
        System.out.println("\nMengeluarkan " + data[top] + " dari stack");
        return data[--top];
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("\nStack Kosong");
        }else {
            System.out.println("\nData teratas : " + data[top]);
        }
    }

    public void printStack(){
        System.out.println("\nData dalam stack : ");
        if (isEmpty()){
            System.out.println("Stack kosong");
        } else{
            for (int i = top; i >= 0; i-- ){
                System.out.println(data[i] + " ")   ;
            }
            System.out.println();
        }
    }

    public void clear(){
        if (isEmpty()) {
            System.out.println("\nStack Kosong");
        } else{
            top =-1;
        }
    }

    public void count(){
        System.out.println("\nJumlah Data dalam stack : " + (top + 1));
    }
}
