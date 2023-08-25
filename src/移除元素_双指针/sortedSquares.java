package 移除元素_双指针;

import java.util.Arrays;
import java.util.stream.IntStream;

public class sortedSquares {
    public static void main(String[] args) {
        int[] nums = {-2,1,2,5,2,6};
        Arrays.sort(nums,0,nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
