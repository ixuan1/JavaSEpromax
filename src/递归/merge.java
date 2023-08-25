package 递归;

public class merge {


    //合并后直接使用Arrays.sout排序
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,6};
        int[] nums2 = nums1;
        nums1[0] = 3;
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums2[i]);
        }
        System.out.println(nums1);
        System.out.println(nums2);
    }


    
}
