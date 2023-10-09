package Java基础.File_IO.d2_recursion;

/**
 * 案例，猴子吃桃问题
 * 猴子第十天最后吃剩一个桃子，每天吃一半还要多吃一个，第一天有多少个
 *公式：  f(n)/2 -1 = f(n+1)
 * f(n) = 2f(n+1) +2
 *终结点：f(10) = 1;所以方向要从1到10，要n+1过去
 */





public class RecursionTest4 {
    public static void main(String[] args) {
        System.out.println(peach(1));
    }

    public static int peach(int n) {
        if (n == 10) {
            return 1;
        } else return peach(n + 1)*2 +2;
    }
}
