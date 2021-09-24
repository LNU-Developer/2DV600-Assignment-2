/*
* Date: 2021-09-24.
* File Name: Node.Java
* Author: Rickard Marjanovic
*
*/

package Queue;

/**
 * Class Description: A class to create a node reference
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
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
