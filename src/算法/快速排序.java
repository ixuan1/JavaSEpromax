package 算法;

public class 快速排序 {

    public static void main(String[] args) {
        int[] nums = {6,3,1,6,7,7,8};
        quickSort(nums,0 ,5);
        for (int a :
                nums) {
            System.out.print(a);
        }

    }

    //快速排序算法
    private static void quickSort(int[] nums, int left, int right) {
        //1.2定义左索引，右索引
        int l = left;
        int r = right;
        //1.2定义基准数
        int pivot = nums[(left + right) / 2];
        //1.3交换临时数
        int temp = 0;
        //2.大循环
        while (l < r) {
            //2.1从左往右遍历，如果遍历到比基准数小的，l索引向右移动一位
            while(nums[l] < pivot) {
                l++;
            }
            //2.2从右往左遍历，如果遍历到比基准数大的，r索引向左移动一位
            while(nums[r] > pivot) {
                r--;
            }
            //**循环结束条件：移动结束后，如果左边的索引比右边大，则跳出循环
            if (l >= r){
                break;
            }
            //2.3左右两边循环移动结束后，也就是右边的索引数比基准数小，左右两边索引进行位置调换
            temp = nums[r];
            nums[r] = nums[l];
            nums[l] = temp;

            //**如果左右两边的索引的数相同，就会陷入循环置换，所以需要右索引 r-- 退一格，打破循环
            //*.1刚好停留在右索引等于基准值，
            if (nums[l] ==nums[r]){
                r--;
            }
            //*.2刚好停留在左索引等于基准值，
            if (nums[r] == nums[l]){
                l++;
            }
        }
        //3.当左右索引重合,
        if (l == r) {
            r--;
            l++;
        }
        //4.递归循环左右子序列
        //4.1左子序列
        if (left < r) {
            quickSort(nums, left ,r);
        }
        //4.2右子序列
        if (right > l) {
            quickSort(nums, l ,right);
        }
    }



}
