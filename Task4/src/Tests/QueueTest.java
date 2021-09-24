/*
* Date: 2021-09-24.
* File Name: QueueTest.Java
* Author: Rickard Marjanovic
*
*/

package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Iterator;

import org.junit.jupiter.api.DisplayName;

import Queue.Queue;

import org.junit.Test;

/**
 * Class Description: A class to test the implementation of the Queue class
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class QueueTest {

    @Test
    @DisplayName("Testing happycase for enqueue")
    public void enqueue_happy_case() {
        Queue<Integer> queue2 = new Queue<Integer>();
        queue2.enqueue(1);
        int size = queue2.size();
        assertEquals(1, queue2.first());
        assertEquals(1, size);
    }

    @Test
    @DisplayName("enqueue a lot of values")
    public void enqueue_alot_of_values() {
        Queue<Integer> queue2 = new Queue<Integer>();
        for (int i = 0; i < 100000000; i++)
            queue2.enqueue(i);
        int size = queue2.size();
        assertEquals(0, queue2.first());
        assertEquals(100000000, size);
    }

    @Test
    @DisplayName("enqueue large values")
    public void enqueue_large_values() {
        Queue<Integer> queue2 = new Queue<Integer>();
        for (int i = 1000000; i < 20000000; i++)
            queue2.enqueue(i);
        int size = queue2.size();
        assertEquals(1000000, queue2.first());
        assertEquals(19000000, size);
    }

    @Test
    @DisplayName("enqueue negative values")
    public void enqueue_negative_values() {
        Queue<Integer> queue2 = new Queue<Integer>();
        for (int i = -10000; i < 10000; i++)
            queue2.enqueue(i);
        int size = queue2.size();
        assertEquals(-10000, queue2.first());
        assertEquals(20000, size);
    }

    @Test
    @DisplayName("Testing happycase for dequeue")
    public void dequeue_happy_case() {
        Queue<Integer> queue2 = new Queue<Integer>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        assertEquals(1, queue2.first());
        assertEquals(2, queue2.size());
        assertEquals(1, queue2.dequeue());
        assertEquals(1, queue2.size());
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in dequeue method when empty")
    public void dequeue_throws_index_out_of_bound_when_index_doesnt_exist() {
        Queue<Integer> queue2 = new Queue<Integer>();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> queue2.dequeue());
        assertEquals("Cannot dequeue when empty queue.", exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for first")
    public void first_happy_case() {
        Queue<Integer> queue2 = new Queue<Integer>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        assertEquals(1, queue2.first());
        assertEquals(2, queue2.size());
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in first method when empty")
    public void first_throws_index_out_of_bound_when_index_doesnt_exist() {
        Queue<Integer> queue2 = new Queue<Integer>();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> queue2.first());
        assertEquals("Cannot get first item when empty queue.", exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for last")
    public void last_happy_case() {
        Queue<Integer> queue2 = new Queue<Integer>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        assertEquals(2, queue2.last());
        assertEquals(2, queue2.size());
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in last method when empty")
    public void last_throws_index_out_of_bound_when_index_doesnt_exist() {
        Queue<Integer> queue2 = new Queue<Integer>();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> queue2.last());
        assertEquals("Cannot get last item when empty queue.", exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for size")
    public void size_happy_case() {
        Queue<Integer> queue = new Queue<Integer>();
        int size = queue.size();
        Queue<Integer> queue2 = new Queue<Integer>();
        queue2.enqueue(1);
        int size2 = queue2.size();
        assertEquals(0, size);
        assertEquals(1, size2);
    }

    @Test
    @DisplayName("Testing happycase for isEmpty")
    public void isEmpty_happy_case() {
        Queue<Integer> queue = new Queue<Integer>();
        Queue<Integer> queue2 = new Queue<Integer>();
        queue2.enqueue(1);
        assertEquals(false, queue2.isEmpty());
        assertEquals(true, queue.isEmpty());
    }

    @Test
    @DisplayName("Testing happycase for iteration")
    public void iteration_happy_case() {
        Queue<Integer> queue2 = new Queue<Integer>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        Iterator<Integer> iterator = queue2.iterator();
        assertEquals(true, iterator.hasNext());
        assertEquals(2, iterator.next());
        assertEquals(false, iterator.hasNext());
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in iteration method when empty")
    public void iteration_throws_index_out_of_bound_when_index_doesnt_exist() {
        Queue<Integer> queue2 = new Queue<Integer>();
        Iterator<Integer> iterator = queue2.iterator();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> iterator.hasNext());
        Throwable exception2 = assertThrows(IndexOutOfBoundsException.class, () -> iterator.next());
        assertEquals("Cannot iterate when empty queue.", exception.getMessage());
        assertEquals("Cannot iterate when empty queue.", exception2.getMessage());
    }
}
