package jg;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedWordsCounterTest {
    @Test
    //input = “aabbabcccba” result = 28
    public void testBalancedWordsCounterCase1() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        assertNotEquals(null, balancedWordsCounter);
        assertEquals(28, balancedWordsCounter.count("aabbabcccba"));
    }
    //input = “” result = 0
    @Test
    public void testBalancedWordsCounterCase2() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        assertNotEquals(null, balancedWordsCounter);
        assertEquals(0, balancedWordsCounter.count(""));
    }
    //input = “abababa1” result = RuntimeException
    @Test
    public void testBalancedWordsCounterCase3() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        assertNotEquals(null, balancedWordsCounter);
        try {
            balancedWordsCounter.count("abababa1");
        } catch (RuntimeException e) {
            assertEquals("not letter", e.getMessage());
        }
    }
    //input = null result = RuntimeException *
    @Test
    public void testBalancedWordsCounterCase4() {
        BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();
        assertNotEquals(null, balancedWordsCounter);
        try {
            balancedWordsCounter.count(null);
        } catch (RuntimeException e) {
            assertEquals("null", e.getMessage());
        }
    }

}
