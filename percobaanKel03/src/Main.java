    import strukturdata.linear.stack;

    public class Main {
        public static void main(String[] args) {
            stack tumpukan = new stack(5);

            System.out.println("-----------------Test Push Data----------------");
            tumpukan.push(1);
            tumpukan.push("dua");
            tumpukan.push("tiga");
            tumpukan.push(4.0f);
            System.out.println("\n-----------------------------------------------\n\n");

            System.out.println("-----------------Test Pop Data----------------");
            tumpukan.pop();
            tumpukan.printStack();
            tumpukan.pop();
            tumpukan.printStack();
            System.out.println("\n-----------------------------------------------\n\n");

            System.out.println("-----------------Test Peek Data----------------");
            tumpukan.peek();
            tumpukan.printStack();
            System.out.println("\n-----------------------------------------------\n\n");

            System.out.println("-----------------Test Lain - lain----------------");
            tumpukan.count();
            tumpukan.clear();
            tumpukan.printStack();
            System.out.println("\n-----------------------------------------------\n\n");
        }
    }