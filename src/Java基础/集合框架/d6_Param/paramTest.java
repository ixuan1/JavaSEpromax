package Java基础.集合框架.d6_Param;

import java.util.Arrays;

/**
 * 掌握可变参数的基本
 */
public class paramTest {

    public static void main(String[] args) {
        test("aaa",1,2,3);
        test("aaa",new int[]{1,3,5,6,});


    }

    public static void test(String s,int...nums){
        System.out.println(Arrays.toString(nums));

    }
}
