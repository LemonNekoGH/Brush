package solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class LintCodeTest {
    @Test
    public void testQ539() {
        var test = new LintCode();
        var actualArrays = new int[][] {
                new int[] { 1, 3, 0, 5, 0 },
                new int[] { 1, 0, 16, 5, 0 },
                new int[] { 0, 3, 0, 5, 9 },
                new int[] { 1, 3, 0, 5, 15 },
        };
        var expectArrays = new int[][] {
                new int[] { 1, 3, 5, 0, 0 },
                new int[] { 1, 16, 5, 0, 0 },
                new int[] { 3, 5, 9, 0, 0 },
                new int[] { 1, 3, 5, 15, 0 },
        };
        for (var arr : actualArrays) {
            test.q539(arr);
        }
        assertArrayEquals(expectArrays, actualArrays);
    }

    @Test
    public void testQ539First() {
        var test = new LintCode();
        var actualArrays = new int[][] {
                new int[] { 1, 3, 0, 5, 0 },
                new int[] { 1, 0, 16, 5, 0 },
                new int[] { 0, 3, 0, 5, 9 },
                new int[] { 1, 3, 0, 5, 15 },
        };
        var expectArrays = new int[][] {
                new int[] { 1, 3, 5, 0, 0 },
                new int[] { 1, 16, 5, 0, 0 },
                new int[] { 3, 5, 9, 0, 0 },
                new int[] { 1, 3, 5, 15, 0 },
        };
        for (var arr : actualArrays) {
            test.q539First(arr);
        }
        assertArrayEquals(expectArrays, actualArrays);
    }

    @Test
    public void testQ407First() {
        var test = new LintCode();
        assertArrayEquals(new int[] { 1, 0, 0, 0 }, test.q407(new int[] { 9, 9, 9 }));
        assertArrayEquals(new int[] { 1, 2, 3, 4 }, test.q407(new int[] { 1, 2, 3, 3 }));
        assertArrayEquals(new int[] { 7, 9, 0 }, test.q407(new int[] { 7, 8, 9 }));
    }
}
