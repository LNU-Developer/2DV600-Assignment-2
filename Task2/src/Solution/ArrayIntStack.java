package Solution;

import two_dv600.AbstractIntCollection;
import two_dv600.IntStack;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
    /* Add integer at top of stack. */
    public void push(int n) {
        int currentSize = size;

        if (values.length >= currentSize)
            resize();

        values[currentSize] = n;
        size++;
    }

    /* Returns and removes integer at top of stack */
    public int pop() throws IndexOutOfBoundsException {
        if (isEmpty())
            throw new IndexOutOfBoundsException("The stack is empty, unable to get and remove the top");
        int value = values[size - 1];
        size--;
        return value;

    }

    /* Returns without removing integer at top of stack */
    public int peek() throws IndexOutOfBoundsException {
        if (isEmpty())
            throw new IndexOutOfBoundsException("The stack is empty, unable to get and remove the top");
        return values[size - 1];
    }

    /* Number of integers currently stored. */
    public int size() {
        return super.size();
    }

    /* Returns true if collection is empty. */
    public boolean isEmpty() {
        return super.isEmpty();
    }

    /* String of type "[ 7 56 -45 68 ... ]" */
    public String toString() {
        return super.toString();
    }
}
