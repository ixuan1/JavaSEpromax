package 二分查找;

public class _367有效的完全平方数 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));


    }
    public static boolean isPerfectSquare(int num) {
        //num大于1
        int l = 0;
        int r = num;
        boolean ans = false;
        while (l <= r) {
            int m = l + (r - l)/2;
            if (m * m > num) { //m的平方大于num时，m一定不是
                r = m - 1;
            }
            else if (m * m < num) {
                l = m + 1;
            }
            else if (m * m == num) {
                return true;
            }
        }
        return false;


    }
}
