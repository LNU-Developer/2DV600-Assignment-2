import Queue.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing queue");
        Queue<Integer> intQueue = new Queue<Integer>();
        for (int i = 0; i < 10; i++)
            intQueue.enqueue(i);

        System.out.println("First: " + intQueue.first());
        System.out.println("Last: " + intQueue.last());
        System.out.println("Size: " + intQueue.size());
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("First: " + intQueue.first());
        System.out.println("Last: " + intQueue.last());
        System.out.println("Size: " + intQueue.size());
    }
}
