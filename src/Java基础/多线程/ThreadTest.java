package Java基础.多线程;

public class ThreadTest {

    //main方法由单独一条线程执行
    public static void main(String[] args) {
        //声明实现Runnable接口的类
        MyRunableThread thread = new MyRunableThread();
        //将Runable对象封转成thread对象
        Thread thread1 = new Thread(thread);
        //线程启动
        thread1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("主线程输出" + i);
        }


        Runnable target1 = new Runnable() {
            //直接创建runable接口的匿名内部类的形式
            @Override
            public void run() {
                //直接实现
                for (int i = 0; i < 20; i++) {
                    System.out.println("子线程2输出" + i);
                }
            }
        };
        new Thread(target1).start();

        //简化方式1：
        new Thread(new Runnable() {
            @Override
            public void run() {
                //直接实现
                for (int i = 0; i < 20; i++) {
                    System.out.println("子线程2输出" + i);
                }
            }
        }).start();

        //简化方式2：使用lambda表达式
        new Thread(() -> {
            //直接实现
            for (int i = 0; i < 20; i++) {
                System.out.println("子线程3输出" + i);
            }
        }).start();



    }
}
