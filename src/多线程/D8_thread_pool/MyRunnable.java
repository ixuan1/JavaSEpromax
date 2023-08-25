package 多线程.D8_thread_pool;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName()+"输出了：===》"+ 1);

        System.out.println(Thread.currentThread().getName() + "线程进入休眠" );
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
