package solutions;

public class LintCode {
    public void q539(int[] nums) {
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

    public void q539First(int[] nums) {
        for (int index = 0; index < nums.length; index ++) {
            for (int index1 = 0; index1 < nums.length; index1 ++) {
                if (nums[index1] == 0 && index1 < nums.length - 1) {
                    nums[index1] = nums[index1 + 1];
                    nums[index1 + 1] = 0;
                }
            }
        }
    }

    /**
     * 给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。
     * 样例输入 1: [1, 2, 3] 样例输出 1: [1, 2, 4]
     * 样例输入 2: [9, 9]    样例输出 2: [1, 0, 0]
     * 
     * 思路，把最后一位数字 + 1，然后按照位数从小到大依次检查需不需要进 1
     */
    public int[] q407(int[] digits) {
        // 把最后一位数字 + 1
        int i = digits.length - 1;
        digits[i] ++;
        // 检查需不要进位
        while (i > 0) {
            if (digits[i] == 10) {
                // 需要进位，把当前位置为 0
                digits[i] = 0;
                // 把高一位 + 1
                digits[i - 1] ++;
            }
            i--;
        }
        int[] ret = digits;
        // 检查最高位是否需要进位
        if (ret[0] == 10) {
            ret = new int[ret.length + 1];
            ret[0] = 1;
        }
        return ret;
    }
}
