package stream;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StreamTaskTest {
   @Test
    void shuffleTest() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actualArr = StreamTasks.shuffle(arr);
            

        assertFalse(Arrays.equals(arr, actualArr));
        for (int i: actualArr) {
            assertTrue(Arrays.binarySearch(arr, i) >= 0);
        }
        
    }
    @Test
    void testShuffleEmptyArray() {
        int[] Array2 = {};
        int[] shuffled = StreamTasks.shuffle(Array2);
        assertEquals(Array2.length, shuffled.length);
    }
}