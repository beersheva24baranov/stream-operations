package stream;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StreamTaskTest {
   @Test
    void shuffleTest() {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] actualArr = StreamTasks.shuffle(arr);
        int[] arr1 = {};
        int[] actualArr1 = StreamTasks.shuffle(arr1);

        assertFalse(Arrays.equals(arr, actualArr));
        for (int i: actualArr) {
            assertTrue(Arrays.binarySearch(arr, i) >= 0);
        }
        assertThrowsExactly(IllegalArgumentException.class, () -> StreamTasks.shuffle(start4));
    }
    
}