package 多线程;


import java.util.concurrent.Callable;

/**
 * 1、让这个类实现callable接口
 */
public class MyCallableThread implements Callable<String> {
    private int n;

    public MyCallableThread(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        //描述线程的任务，返回线程执行后的结果
        //需求返回1 到 n 的和
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum +=i;
        }
        return "线程计算" + n + "的总和是" + sum;
    }
}
