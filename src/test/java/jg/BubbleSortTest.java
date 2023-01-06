package jg;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BubbleSortTest  {
    @Test
    public void testBubbleSortCase1() {
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        assertNotEquals(null, bubbleSort);
        List<Integer> a = Arrays.asList(1, 4, 5, 6, 8, 3, 8);
        bubbleSort.sort(a);
        assertEquals(Arrays.asList(1, 3, 4, 5, 6, 8, 8), a);
    }
    @Test
    public void testBubbleSortCase2(){
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        assertNotEquals(null, bubbleSort);
        List<Double> a = new ArrayList<>(Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0));
        bubbleSort.sort(a);
        assertEquals(Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0), a);
    }
    @Test
    public void testBubbleSortCase3(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        assertNotEquals(null, bubbleSort);
        List<Integer> a = new ArrayList<>();
        bubbleSort.sort(a);
        assertEquals(new ArrayList<>(), a);

    }
    @Test
    public void testBubbleSortCase4(){
        BubbleSort<Double> bubbleSort = new BubbleSort<>();
        assertNotEquals(null, bubbleSort);
        List<Double> a = new ArrayList<>(Arrays.asList(null,5.0001));
        bubbleSort.sort(a);
        assertEquals(Arrays.asList(5.0001), a);
    }

    @Test
    public void testBubbleSortCase5(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        assertNotEquals(null, bubbleSort);
        try {
            bubbleSort.sort(null);
        } catch (RuntimeException e) {
            assertNotEquals("", e.getMessage());
        }
    }
}
