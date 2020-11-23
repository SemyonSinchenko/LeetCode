package RemoveElement;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void examplesTest() {
        int[] test1 = { 3, 2, 2, 3 };
        int len1 = solution.removeElement(test1, 3);
        assertArrayEquals(new int[] { 2, 2 }, Arrays.copyOf(test1, len1));

        int[] test2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int len2 = solution.removeElement(test2, 2);
        assertArrayEquals(new int[] { 0, 1, 3, 0, 4 }, Arrays.copyOf(test2, len2));
    }
}
