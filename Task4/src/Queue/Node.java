package Queue;

public class Node<E> {
    private Node<E> next = null;
    private E data;

    public Node(E data) {
        this.data = data;
    }

    public E get() {
        return data;
    }

    public Node<E> next() {
        return next;
    }

    public void set(Node<E> data) {
        next = data;
    }
}
