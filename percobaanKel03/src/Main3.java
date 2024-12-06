import strukturdata.linear.Queue;

public class Main3 {
    public static void main(String[] args) {
        Queue antrian = new Queue(5);

        System.out.println("-------------tes-enqueue-data--------------");
        antrian.enqueue(1);
        antrian.enqueue("dua");
        antrian.enqueue("tiga");
        antrian.enqueue(4.0f);
        antrian.printQueue();
        System.out.println("\n---------------------------------------------\n\n");

        System.out.println("----------------tes-dequeue-data----------------------");
        antrian.dequeue();
        antrian.printQueue();
        antrian.dequeue();
        antrian.printQueue();
        System.out.println("\n--------------------------------------------------\n\n");

        System.out.println("---------------tes-peek-data----------------------------");
        antrian.peek();
        antrian.printQueue();
        System.out.println("\n----------------------------------------------------\n\n");

        System.out.println("---------------tes-lain-lain-----------------");
        antrian.count();
        antrian.printQueue();
        System.out.println("\n-----------------------------------------------------------\n\n");
    }
}
