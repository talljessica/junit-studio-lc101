package test;

import main.BalancedBrackets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_class;

    @Before
    public void createTestClass() {
        test_class = new BalancedBrackets();
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true); }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAtBeginningAndEndReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsInTheMiddleAndEndReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsAtBeginningReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets(""));
    }

    @Test
    public void moreThanOneSetOfBalancedBracketsReturnsTrue() {
        assertTrue(test_class.hasBalancedBrackets("[][][][]"));
    }

    //false returns

    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("["));
    }

    @Test
    public void startsWithClosingBracketReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOpeningBracketBeforeStringReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketsInWrongOrderReturnsFalse() {
        assertFalse(test_class.hasBalancedBrackets("Launch]Code["));
    }
}