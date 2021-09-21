
import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import Tests.ArrayIntListTest;
import Tests.ArrayIntStackTest;

public class CollectionTest {
    public static void main(String[] args) throws Exception {
        JUnitCore junit = new JUnitCore();
        junit.addListener(new TextListener(System.out));
        junit.run(ArrayIntListTest.class);
        junit.run(ArrayIntStackTest.class);
    }
}
