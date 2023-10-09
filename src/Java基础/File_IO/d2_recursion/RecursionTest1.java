package Java基础.File_IO.d2_recursion;

/**
 * 掌握递归的形式
 */
public class RecursionTest1 {
    public static void main(String[] args) {

        Test1();

    }

    //1.直接方法递归
    public static void Test1() {
        System.out.println("test1");
        Test1();
    }

    //2.间接方法递归,调用的方法回调自己
    public static void Test2() {
        System.out.println("test2");
        Test3();
    }
    public static void Test3() {
        System.out.println("test2");
        Test2();
    }
}
