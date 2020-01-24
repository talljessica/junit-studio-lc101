package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    private BonusBinarySearch test_class = new BonusBinarySearch();
    private int[] sortedNumbers = { 1, 2, 4, 10, 20 };

    @Test
    public void returnIntInMiddleOfArray() {
        assertEquals(4, test_class.binarySearch(sortedNumbers, 4));
    }

    @Test
    public void returnIntInRightHalfOfArray() {
        assertEquals(10, test_class.binarySearch(sortedNumbers, 10));
    }

    @Test
    public void returnIntInLeftHalfOfArray() {
        assertEquals(1, test_class.binarySearch(sortedNumbers, 1));
    }

    @Test
    public void returnNegativeOneIfNotInArray() {
        assertEquals(-1, test_class.binarySearch(sortedNumbers, 50));
    }
}
