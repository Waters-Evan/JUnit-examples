import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTests {

    @Test
    public void multiplicationTest() {

        // MyClass is tested
        MyClass tester = new MyClass();

        // assert statements
        assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
        assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
        assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
        assertEquals("2 x 2 must be 4", 4, tester.multiply(2, 2));
        assertEquals("9 x 5 must be 45", 45, tester.multiply(9, 5));
    }

}
