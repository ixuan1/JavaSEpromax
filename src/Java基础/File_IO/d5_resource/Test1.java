package Java基础.File_IO.d5_resource;


/**
 * 目标：初识try - catch - finally
 */
public class Test1 {
    public static void main(String[] args) {

        //无返回值的方法使用try catch
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally执行了一次------");
        }
        System.out.println(chu(10 , 2));
    }

    //定义一个有返回值的方法
    public static int chu(int a, int b) {
        try {
            return a/b;
        } catch (Exception e) {
            e.printStackTrace();
            return -1; //返回-1 代表异常
        } finally {
            //不能在finall里中返回数据
            System.out.println("finally执行了");
        }
    }



}
