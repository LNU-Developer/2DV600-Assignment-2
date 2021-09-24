/*
* Date: 2021-09-24.
* File Name: CollectionTest.Java
* Author: Rickard Marjanovic
*
*/

import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import Tests.ArrayIntListTest;
import Tests.ArrayIntStackTest;

/**
 * Class Description: The main class to run the program
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class CollectionTest {
    public static void main(String[] args) throws Exception {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(ArrayIntListTest.class);
        junit.run(ArrayIntStackTest.class);
    }
}
