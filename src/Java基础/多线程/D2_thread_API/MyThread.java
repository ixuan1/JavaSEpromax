package Java基础.多线程.D2_thread_API;

/**
 * 1、让子类继承多线程
 *
 */
public class MyThread extends Thread{
    //为当前线程设置名字，
    public MyThread(String name) {
        super(name); //调用thread的构造器
    }

    //2。 必须重写Thread的run方法
    @Override
    public void run() {
        //3.描述线程的任务
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread输出" + i);
        }
    }
}
