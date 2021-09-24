/*
* Date: 2021-09-24.
* File Name: App.Java
* Author: Rickard Marjanovic
*
*/

package Solution;

import java.util.Iterator;

import two_dv600.AbstractIntCollection;
import two_dv600.IntList;

/**
 * Class Description: A class to create/handle an int list
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class ArrayIntList extends AbstractIntCollection implements IntList {
    /* Add integer n to the end of the list. */
    public void add(int n) {
        int currentSize = size;

        if (values.length >= currentSize)
            resize();

        values[currentSize] = n;
        size++;

    }

    /*
     * Inserts integer n at position index. Shifts the element currently at that
     * position (if any) and any subsequent elements to the right.
     */
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        if (isEmpty() || !checkIndex(index, size))
            throw new IndexOutOfBoundsException(
                    "Index " + index + " bigger than total size" + size + ". Unable to add at index.");
        add(n);
        for (int i = size; i > index; i--) {
            values[i] = values[i - 1];
        }
        values[index] = n;

    }

    /* Remove integer at position index. */
    public void remove(int index) throws IndexOutOfBoundsException {
        if (isEmpty() || !checkIndex(index, size))
            throw new IndexOutOfBoundsException(
                    "Index " + index + " bigger than total size" + size + ". Unable to remove at index.");

        for (int i = index; i < size; i++) {
            values[i] = values[i + 1];
        }

        size--;
    }

    /* Get integer at position index. */
    public int get(int index) throws IndexOutOfBoundsException {
        if (isEmpty() || !checkIndex(index, size))
            throw new IndexOutOfBoundsException(
                    "Index " + index + " bigger than total size" + size + ". Unable to get at index.");
        return values[index];
    }

    /* Number of integers currently stored. */
    public int size() {
        return super.size();
    }

    /* Returns true if collection is empty. */
    public boolean isEmpty() {
        return super.isEmpty();
    }

    /* Find position of integer n, otherwise return -1 */
    public int indexOf(int n) {
        Iterator<Integer> iterator = iterator();
        int count = 0;
        while (iterator.hasNext()) {
            if (iterator.next() == n) {
                return count;
            }
            count++;
        }
        return -1;
    }

    /* String of type "[ 7 56 -45 68 ... ]" */
    public String toString() {
        return super.toString();
    }
}
