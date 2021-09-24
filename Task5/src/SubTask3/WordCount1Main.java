
/*
* Date: 2021-09-24.
* File Name: WordCount1Main.Java
* Author: Rickard Marjanovic
*
*/

package SubTask3;

import java.io.File;
import java.util.*;

import SubTask2.Word;

/**
 * Class Description: This is a class to read a file containing words count
 * different words as well as print out unique words and words in alphabetical
 * order
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class WordCount1Main {

    HashSet<Word> hashSet = new HashSet<>();
    TreeSet<Word> treeSet = new TreeSet<>();
    String path;
    String readFileName;
    Scanner scanner;

    public WordCount1Main(String path, String readFileName) {
        this.path = path;
        this.readFileName = readFileName;
    }

    public void readFromFile() {
        try {
            scanner = new Scanner(new File(path + readFileName));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addWordsToTables() {
        while (scanner.hasNext()) {
            Word word = new Word(scanner.next());
            hashSet.add(word);
            treeSet.add(word);
        }
        scanner.close();
    }

    private void print(Set<Word> object) {
        System.out.print(object.getClass().getSimpleName() + " size = " + object.size() + "\n");
        for (Word word : object) {
            System.out.print(word + " ");
        }
        System.out.println("\n");
    }

    public void printHash() {
        print(hashSet);
    }

    public void printTree() {
        print(treeSet);
    }
}
