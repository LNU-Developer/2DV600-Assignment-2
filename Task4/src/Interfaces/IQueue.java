/*
* Date: 2021-09-24.
* File Name: IQueue.Java
* Author: Rickard Marjanovic
*
*/

package Interfaces;

/**
 * Interface Description: An interface to set the rules for the queue class
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public interface IQueue<E> extends Iterable<E> {
    int size(); // current queue size

    boolean isEmpty(); // true if queue is empty

    void enqueue(E element); // add element at end of queue

    E dequeue(); // return and remove first element.

    E first(); // return (without removing) first element

    E last(); // return (without removing) last element
}
