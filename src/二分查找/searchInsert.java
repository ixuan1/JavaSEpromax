package 二分查找;
//时间复杂度为O(logn)
//二分法查找，也称为折半法，是一种在有序数组中查找特定元素的搜索算法

public class searchInsert {
    public static int search(int[] nums, int target){
        int n = nums.length;
        int l = 0, r = n-1;
        while (l <= r){
            int mid = l + (r - l)/2;
            if (target <= nums[mid] )
                r = mid - 1;
            else
                l = mid + 1;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(search(nums, target));
    }

}
