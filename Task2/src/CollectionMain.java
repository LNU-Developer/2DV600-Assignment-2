/*
* Date: 2021-09-24.
* File Name: CollectionMain.Java
* Author: Rickard Marjanovic
*
*/

import Solution.ArrayIntList;
import Solution.ArrayIntStack;

/**
 * Class Description: The main class to run the program
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class CollectionMain {
    public static void main(String[] args) {
        try {
            testingIntListFunctionality();
            testingIntStackFunctionality();
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void testingIntListFunctionality() {
        System.out.println("[Testing IntList Functionality]");

        ArrayIntList intList = new ArrayIntList();
        System.out.println("\nOriginal list");
        System.out.println(intList.toString());

        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }

        System.out.println("\nAfter addition");
        System.out.println(intList.toString());

        intList.addAt(1000, 4);
        System.out.println("\nAdded 1000 at index 4");
        System.out.println(intList.toString());

        System.out.println("\nFinding the index of 1000");
        System.out.println(intList.indexOf(1000));
        System.out.println(intList.toString());

        intList.remove(1);
        System.out.println("\nRemoved the number at index 1");
        System.out.println(intList.toString());

        System.out.println("\nGet the number at index 5");
        System.out.println(intList.get(5));
    }

    public static void testingIntStackFunctionality() {
        System.out.println("\n\n[Testing IntStack Functionality]");

        ArrayIntStack intStack = new ArrayIntStack();
        System.out.println("\nOriginal list");
        System.out.println(intStack.toString());

        for (int i = 0; i < 10; i++) {
            intStack.push(i);
        }

        System.out.println("\nAfter addition");
        System.out.println(intStack.toString());

        System.out.println("\nRemove the top stack");
        System.out.println(intStack.pop());
        System.out.println(intStack.toString());

        System.out.println("\nGetting the top stack without removing");
        System.out.println(intStack.peek());
        System.out.println(intStack.toString());

    }
}