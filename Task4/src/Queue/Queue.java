package Queue;

import Interfaces.IQueue;
import java.util.Iterator;

public class Queue<E> implements IQueue<E> {
    private Node<E> head = null; // Head points to the start of the queue
    private Node<E> tail = null; // Tail points to the end of the queque
    private int size = 0;

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void enqueue(E element) {
        if (head == null) { // If the queueu is empty it would create a new node as head and since thats the
                            // only item it would reference that to the tail as well
            head = new Node<E>(element);
            tail = head;
        } else {
            tail.set(new Node<E>(element));
            tail = tail.next();
        }
        size++;
    }

    public E dequeue() throws IndexOutOfBoundsException {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Cannot dequeue when empty queue.");
        E tmp = first();
        head = head.next();
        size--;
        return tmp;
    }

    public E first() throws IndexOutOfBoundsException {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Cannot get first item when empty queue.");
        return head.get();
    }

    public E last() throws IndexOutOfBoundsException {
        if (isEmpty())
            throw new IndexOutOfBoundsException("Cannot get last item when empty queue.");
        Iterator<E> iterator = iterator();
        E tmp = null;
        do {
            tmp = iterator.next();
        } while (iterator.hasNext());
        return tmp;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            public boolean hasNext() throws IndexOutOfBoundsException {
                if (isEmpty()) {
                    throw new IndexOutOfBoundsException("Cannot iterate when empty queue.");
                }
                return current.next() != null;
            }

            public E next() throws IndexOutOfBoundsException {
                if (isEmpty())
                    throw new IndexOutOfBoundsException("Cannot iterate when empty queue.");
                current = current.next();
                return current.get();
            }
        };
    }
}
