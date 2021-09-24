package SubTask3;

import java.io.File;
import java.util.*;

import SubTask2.Word;

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
