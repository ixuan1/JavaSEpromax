package Java基础.多线程;

public class MyRunableThread implements Runnable{

    /**
     * 定义子类实现Runnable接口
     */

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("MyRunnable线程输出" + i);
        }
    }
}
