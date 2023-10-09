package Java基础.File_IO.d2_recursion;

/**
 * 案例，计算1~n的阶乘
 * 三要素：递归的公式、递归的终结点、递归的方向必须走向终结点
 *f(n) = f(n - 1) * n
 */
public class RecursionTest2 {
    public static void main(String[] args) {
        //1.阶乘公式
        System.out.println(f(3));

    }

    public static int f(int n) {
        //终结点
        if (n == 1){
            return 1;
        } else return f(n - 1)*n;

    }


}
