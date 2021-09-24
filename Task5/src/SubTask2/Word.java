/*
* Date: 2021-09-24.
* File Name: Word.Java
* Author: Rickard Marjanovic
*
*/

package SubTask2;

/**
 * Class Description: This is a class to compare different words to each other
 *
 * @version 1, 2021-09-24
 * @author Rickard Marjanovic
 */
public class Word implements Comparable<Word> {
    private String word;

    public Word(String str) {
        word = str;
    }

    public String toString() {
        return word;
    }

    public int hashCode() {
        return word.toLowerCase().hashCode();
    }

    public boolean equals(Object other) {
        return hashCode() == other.hashCode();
    }

    public int compareTo(Word w) {
        return word.compareToIgnoreCase(w.toString());
    }

}