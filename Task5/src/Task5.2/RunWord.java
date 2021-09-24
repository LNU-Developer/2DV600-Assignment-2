public class RunWord {
    public static void main(String[] args) {
        Word test = new Word("Test");
        Word test2 = new Word("Test1");
        Word test3 = new Word("Test");
        System.out.println(test.hashCode());
        System.out.println(test2.hashCode());
        System.out.println(test3.hashCode());
        System.out.println(test.equals(test2));
        System.out.println(test.equals(test3));
    }
}
