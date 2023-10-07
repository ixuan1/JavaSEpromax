package Java基础.多线程.D2_thread_API;

/**
 *目标：掌握Thread的常用方法
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        //1、创建一个新线程类
        MyThread t1 = new MyThread("子线程1");
        //2、可以设置名字
        //t1.setName("子线程1");
        t1.start();

        //
    }


}
