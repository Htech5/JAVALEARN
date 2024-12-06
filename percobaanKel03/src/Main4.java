import strukturdata.linear.Queue;
public class Main4 {
    public static void main(String[] args) {
        Queue dataQueue = new Queue(3);

        String[] dataToSend =  {"Packet1", "Packet2", "Packet3", "Packet4", "Packet5", "Packet6", "Packet7"};
        System.out.println("\n-----------------simulasi pengiriman data------------------");
        for (String data : dataToSend){
            dataQueue.enqueue(data);
            dataQueue.printQueue();
            if(dataQueue.isFull()){
                System.out.println("\nAntian penuh, meunggu buffer kosong......\n");
                System.out.println("\n------------Simulasi pengambilan data----------------");
                while (!dataQueue.isEmpty()){
                    dataQueue.dequeue();
                    dataQueue.printQueue();
                }
                System.out.println("\nBuffer kososng, melanjutkan pengiriman......\n");
            }
        }
        if(!dataQueue.isEmpty()){
            System.out.println("\n---------------mengeluarkan sisa data---------------");
            while (!dataQueue.isEmpty()){
                dataQueue.dequeue();
                dataQueue.printQueue();
            }
        }
    }
}

