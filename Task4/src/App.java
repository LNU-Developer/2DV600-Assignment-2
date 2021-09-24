/*
* Date: 2021-09-24.
* File Name: App.Java
* Author: Rickard Marjanovic
*
*/

import Queue.Queue;

/**
 * Class Description: The main class to run the program
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testing queue");
        Queue<Integer> intQueue = new Queue<Integer>();
        for (int i = 0; i < 10; i++)
            intQueue.enqueue(i);

        System.out.println("First: " + intQueue.first());
        System.out.println("Last: " + intQueue.last());
        System.out.println("Size: " + intQueue.size());
        System.out.println("Dequeue: " + intQueue.dequeue());
        System.out.println("First: " + intQueue.first());
        System.out.println("Last: " + intQueue.last());
        System.out.println("Size: " + intQueue.size());
    }
}
