/*
* Date: 2021-09-24.
* File Name: App.Java
* Author: Rickard Marjanovic
*
*/

package Tests;

import Solution.ArrayIntList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.Test;

/**
 * Class Description: A class to test the create/handle of an int list
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class ArrayIntListTest {
    @Test
    @DisplayName("Testing happycase for add")
    public void add_happy_case() {
        ArrayIntList intList = new ArrayIntList();
        int value = 5;
        intList.add(5);
        int size = intList.size();
        assertEquals(value, intList.get(0));
        assertEquals(1, size);
    }

    @Test
    @DisplayName("Testing happycase for addAt")
    public void addAt_happy_case() {
        ArrayIntList intList = seedArray();
        int value = 5;
        int index = 1;
        intList.addAt(value, index);
        int size = intList.size();
        assertEquals(value, intList.get(1));
        assertEquals(11, size);
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in addAt method when index out of bound")
    public void addAt_throws_index_out_of_bound_when_index_doesnt_exist() {
        ArrayIntList intList = seedArray();
        int value = 5;
        int index = 15;
        int size = intList.size();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.addAt(value, index));
        assertEquals("Index " + index + " bigger than total size" + size + ". Unable to add at index.",
                exception.getMessage());
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in addAt method when empty array")
    public void addAt_throws_index_out_of_bound_when_empty_array() {
        ArrayIntList intList = new ArrayIntList();
        int value = 5;
        int index = 15;
        int size = intList.size();
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.addAt(value, index));
        assertEquals("Index " + index + " bigger than total size" + size + ". Unable to add at index.",
                exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for remove")
    public void remove_happy_case() {
        ArrayIntList intList = seedArray();
        intList.remove(0);
        int size = intList.size();
        assertEquals(1, intList.get(0));
        assertEquals(9, size);
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in remove method when index out of bound")
    public void remove_throws_index_out_of_bound_when_index_doesnt_exist() {
        ArrayIntList intList = seedArray();
        int index = 15;
        int size = intList.size();

        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.remove(index));
        assertEquals("Index " + index + " bigger than total size" + size + ". Unable to remove at index.",
                exception.getMessage());
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in remove method when empty array")
    public void remove_throws_index_out_of_bound_when_empty_array() {
        ArrayIntList intList = new ArrayIntList();
        int index = 15;
        int size = intList.size();

        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.remove(index));
        assertEquals("Index " + index + " bigger than total size" + size + ". Unable to remove at index.",
                exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for get")
    public void get_happy_case() {
        ArrayIntList intList = seedArray();
        int size = intList.size();
        assertEquals(0, intList.get(0));
        assertEquals(10, size);
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in get method when index out of bound")
    public void get_throws_index_out_of_bound_when_index_doesnt_exist() {
        ArrayIntList intList = seedArray();
        int index = 15;
        int size = intList.size();

        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.get(index));
        assertEquals("Index " + index + " bigger than total size" + size + ". Unable to get at index.",
                exception.getMessage());
    }

    @Test
    @DisplayName("Testing IndexOutOfBoundsException exception in get method when empty array")
    public void get_throws_index_out_of_bound_when_empty_array() {
        ArrayIntList intList = new ArrayIntList();
        int index = 15;
        int size = intList.size();

        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> intList.get(index));
        assertEquals("Index " + index + " bigger than total size" + size + ". Unable to get at index.",
                exception.getMessage());
    }

    @Test
    @DisplayName("Testing happycase for size")
    public void size_happy_case() {
        ArrayIntList intList = seedArray();
        int size = intList.size();
        assertEquals(10, size);
    }

    @Test
    @DisplayName("Testing happycase for isEmpty")
    public void isEmpty_happy_case() {
        ArrayIntList intList = seedArray();
        ArrayIntList emptyIntList = new ArrayIntList();
        assertEquals(false, intList.isEmpty());
        assertEquals(true, emptyIntList.isEmpty());
    }

    @Test
    @DisplayName("Testing happycase for indexOf")
    public void indexOf_happy_case() {
        ArrayIntList intList = seedArray();
        ArrayIntList emptyIntList = new ArrayIntList();
        assertEquals(0, intList.indexOf(0));
        assertEquals(-1, emptyIntList.indexOf(0));
    }

    @Test
    @DisplayName("Testing happycase for toString")
    public void toSting_happy_case() {
        ArrayIntList intList = seedArray();
        ArrayIntList emptyIntList = new ArrayIntList();
        assertEquals("[ ]", emptyIntList.toString());
        assertEquals("[ 0 1 2 3 4 5 6 7 8 9 ]", intList.toString());
    }

    private ArrayIntList seedArray() {
        ArrayIntList intList = new ArrayIntList();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        return intList;
    }
}