package 二分查找;

public class 在排序数组中查找元素的第一个和最后一个位置 {

    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length - 1;
        int left = 0;
        int right = n;
        int[] ans ={-1,-1};
        while (left <= right){
            int middle = left + ((right - left)/2);  //防止溢出
            if(nums[middle] > target ){
                right = middle - 1;
            }
            else if(nums[middle] < target ){
                left = middle + 1;
            }
            else if(nums[middle] == target){
                ans[0] = left;
                ans[1] = left +1;
                return ans;
            }
        }
        return ans;
    }
    //求右边界
    public static int getRightBorder(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int rightBorder = -2; // 记录一下rightBorder没有被赋值的情况
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] > target) {
                right = middle - 1;
            } else { // 寻找右边界，nums[middle] == target的时候更新left
                left = middle + 1;
                rightBorder = left;
            }
        }
        return rightBorder;
    }

    //求左边界
    public static int getLeftBorder(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int leftBorder = -2; // 记录一下rightBorder没有被赋值的情况
        while (left <= right) {
            int middle = left + ((right - left) / 2);
            if (nums[middle] >= target) {
                right = middle - 1;
                leftBorder = right;
            } else { // 寻找右边界，nums[middle] == target的时候更新left
                left = middle + 1;

            }
        }
        return leftBorder;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 6;

        int a = getRightBorder(nums, target);
        int b = getLeftBorder(nums, target);
        System.out.println("右边界："+a);
        System.out.println("左边界："+b);

    }
}
