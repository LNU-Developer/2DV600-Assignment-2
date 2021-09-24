package SubTask2;

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