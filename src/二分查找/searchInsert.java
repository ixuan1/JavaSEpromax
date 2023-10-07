package 二分查找;
//时间复杂度为O(logn)
//二分法查找，也称为折半法，是一种在有序数组中查找特定元素的搜索算法

public class searchInsert {

    public static int search(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else return middle;
        }
        return -1;
    }
























    public static  int search1(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while( l <= r) {
            int middle = (l+r)/2;
            if(nums[middle] > target) {
                r = middle - 1;
            }
            else if(nums[middle] < target){
                l = middle + 1;
            }
            else if(nums[middle] == target){
                return middle;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,8,4};
        int target = 6;
        System.out.println("查找的元素下表是："+search(nums, target));
    }

}
