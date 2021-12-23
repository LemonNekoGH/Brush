package solutions;

public class TwoPointers {
    /**
     * 来源 https://www.lintcode.com/problem/539
     * 别人的答案
     * @param nums
     */
    public void LintCode539MoveZeroes(int[] nums) {
        int ptr1 = 0, ptr2 = 0;
        while (ptr1 < nums.length) {
            if (nums[ptr1] != 0) {
                nums[ptr2] = nums[ptr1];
                ptr2++;
            }
            ptr1++;
        }
        while (ptr2 < nums.length) {
            nums[ptr2++] = 0;
        }
    }

    /**
     * 这是第一次做这道题时给的答案
     * 循环两次，遇到 0 就和后一位交换
     * 这种方法很耗时间
     * @param nums
     */
    public void LintCode539MoveZeroesFirst(int[] nums) {
        for (int index = 0; index < nums.length; index ++) {
            for (int index1 = 0; index1 < nums.length; index1 ++) {
                if (nums[index1] == 0 && index1 < nums.length - 1) {
                    nums[index1] = nums[index1 + 1];
                    nums[index1 + 1] = 0;
                }
            }
        }
    }
}
