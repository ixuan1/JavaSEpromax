package 移除元素_双指针;

public class removeElement {
//    双指针
public static void main(String[] args) {
    int[] nums = {1,2,4,2,5};
    removeElement2(nums, 2);

}
    public static int removeElement(int[] nums, int val){
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if(nums[right] != val){
                nums[left] = nums[right];
                left++;
            }

        }
        return left;
    }
    
    
    
    //暴力
    public static int removeElement2(int[] nums, int val){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                for (int j = 0; j < n; j++) {
                    nums[j] = nums[j+1];
                }
                n--;
                i--;
            }
        }
        return n;
    }
}
