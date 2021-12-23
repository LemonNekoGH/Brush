package solutions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoPointersTest {
    @Test
    public void testLintCode539MoveZeroes() {
        var test = new TwoPointers();
        var actualArrays = new int[][]{
            new int[]{1, 3, 0, 5, 0},
            new int[]{1, 0, 16, 5, 0},
            new int[]{0, 3, 0, 5, 9},
            new int[]{1, 3, 0, 5, 15},
        };
        var expectArrays = new int[][]{
            new int[]{1, 3, 5, 0, 0},
            new int[]{1, 16, 5, 0, 0},
            new int[]{3, 5, 9, 0, 0},
            new int[]{1, 3, 5, 15, 0},
        };
        for (var arr : actualArrays) {
            test.LintCode539MoveZeroes(arr);
        }
        assertArrayEquals(expectArrays, actualArrays);
    }

    @Test
    public void testLintCode539MoveZeroesFirst() {
        var test = new TwoPointers();
        var actualArrays = new int[][]{
            new int[]{1, 3, 0, 5, 0},
            new int[]{1, 0, 16, 5, 0},
            new int[]{0, 3, 0, 5, 9},
            new int[]{1, 3, 0, 5, 15},
        };
        var expectArrays = new int[][]{
            new int[]{1, 3, 5, 0, 0},
            new int[]{1, 16, 5, 0, 0},
            new int[]{3, 5, 9, 0, 0},
            new int[]{1, 3, 5, 15, 0},
        };
        for (var arr : actualArrays) {
            test.LintCode539MoveZeroesFirst(arr);
        }
        assertArrayEquals(expectArrays, actualArrays);
    }
}
