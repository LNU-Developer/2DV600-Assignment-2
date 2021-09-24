
/*
* Date: 2021-09-24.
* File Name: App.Java
* Author: Rickard Marjanovic
*
*/
import SubTask1.IdentifyWordsMain;
import SubTask2.Word;
import SubTask3.WordCount1Main;

/**
 * Class Description: The main class to run the program
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class App {
    public static void main(String[] args) {
        runTask1();
        testTask2();
        runTask3();
    }

    private static void runTask1() {
        String path = "src/Task1/";
        String readFile = "HistoryOfProgramming.txt";
        String writeFile = "words.txt";
        IdentifyWordsMain words = new IdentifyWordsMain(path, readFile, writeFile);
        words.readFromFile();
        words.cleanWords();
        words.writeToFile();
    }

    private static void testTask2() {
        Word test = new Word("Test");
        Word test2 = new Word("Test1");
        Word test3 = new Word("Test");
        System.out.println(test.hashCode());
        System.out.println(test2.hashCode());
        System.out.println(test3.hashCode());
        System.out.println(test.equals(test2));
        System.out.println(test.equals(test3));
    }

    private static void runTask3() {
        String path = "src/Task1/";
        String readFile = "words.txt";
        WordCount1Main wordCount = new WordCount1Main(path, readFile);

        wordCount.readFromFile();
        wordCount.addWordsToTables();
        wordCount.printHash();
        wordCount.printTree();
    }
}
