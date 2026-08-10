package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }
    @Test
    public void testSquarePrimesSimple2(){
        IntList lst2 = IntList.of(57,3,59,61,2,5);
        boolean changed = IntListExercises.squarePrimes(lst2);
        assertEquals("57 -> 9 -> 3481 -> 3721 -> 4 -> 25", lst2.toString());
        assertTrue(changed);

    }
}
