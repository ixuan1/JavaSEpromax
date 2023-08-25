package removeDuplicate;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4};
        System.out.println(removeDup(nums));
        System.out.println("==========================");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static int removeDup(int[] nums){
        int n = nums.length;
        if (n == 0)
            return 0;
        int fast = 1,slow = 1;
        while (fast < n){
            if (nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }

        return  slow;
    }
}
