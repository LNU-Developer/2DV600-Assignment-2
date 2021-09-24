/*
* Date: 2021-09-24.
* File Name: App.Java
* Author: Rickard Marjanovic
*
*/

package Tests;

import Solution.ArrayIntStack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

/**
 * Class Description: A class to test the create/handle of an int stack
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class ArrayIntStackTest {
    @Test
    @DisplayName("Testing happycase for push")
    public void push_happy_case() {
        ArrayIntStack intStack = new ArrayIntStack();
        int value = 5;
        intStack.push(5);
        int size = intStack.size();
        assertEquals(value, intStack.peek());
        assertEquals(1, size);
    }

    @Test
    @DisplayName("Testing happycase for pop")
    public void pop_happy_case() {
        ArrayIntStack intStack = new ArrayIntStack();
        int value = 5;
        intStack.push(5);
        int size = intStack.size();
        assertEquals(value, intStack.pop());
        assertEquals(1, size);
        int size2 = intStack.size();
        assertEquals(0, size2);
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in pop method when empty array")
    public void pop_throws_index_out_of_bound_when_empty_array() {
        ArrayIntStack intList = new ArrayIntStack();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.pop());
        assertEquals("The stack is empty, unable to get and remove the top", exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for peek")
    public void peel_happy_case() {
        ArrayIntStack intStack = new ArrayIntStack();
        int value = 5;
        intStack.push(5);
        int size = intStack.size();
        assertEquals(value, intStack.peek());
        assertEquals(1, size);
        int size2 = intStack.size();
        assertEquals(1, size2);
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in peek method when empty array")
    public void peek_throws_index_out_of_bound_when_empty_array() {
        ArrayIntStack intList = new ArrayIntStack();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.peek());
        assertEquals("The stack is empty, unable to peek at the top", exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for size")
    public void size_happy_case() {
        ArrayIntStack intStack = new ArrayIntStack();
        int value = 5;
        intStack.push(value);
        int size = intStack.size();
        assertEquals(1, size);
    }

    @Test
    @DisplayName("Testing happycase for isEmpty")
    public void isEmpty_happy_case() {
        ArrayIntStack intStack = new ArrayIntStack();
        int value = 5;
        intStack.push(value);
        ArrayIntStack intStack2 = new ArrayIntStack();
        assertEquals(false, intStack.isEmpty());
        assertEquals(true, intStack2.isEmpty());
    }

    @Test
    @DisplayName("Testing happycase for toString")
    public void toSting_happy_case() {
        ArrayIntStack intStack = new ArrayIntStack();
        int value = 5;
        intStack.push(value);
        ArrayIntStack intStack2 = new ArrayIntStack();
        assertEquals("[ ]", intStack2.toString());
        assertEquals("[ 5 ]", intStack.toString());
    }
}