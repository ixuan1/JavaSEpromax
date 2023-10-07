package Java基础.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建多线程的方法三：实现callable接口
 */
public class CallableThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //3、创建一个callable对象
         Callable<String> callable = new MyCallableThread(100);
         //4、把Callable的对象封装成一个FutureTask对象
        FutureTask<String> futureTask = new FutureTask<>(callable);
        //未来任务对象的作用
        //1.是一个任务对象，实现了Runnable接口，可以交给一个thread对象
        //2.可以再线程执行完毕后，用未来任务对象的get方法获取线程执行完毕后返回的结果
        //5、交给一个thread对象
        Thread t1 = new Thread(futureTask);
        t1.setName("T1线程");
        t1.start();
        System.out.println("线程T1的名称" + t1.getName());
        System.out.println("主线程的名称" + Thread.currentThread().getName());


        //6、使用get方法获得结果，因为重写call方法那可能会返回异常结果，所以要抛异常
        //注意：如果执行到这儿，假如上面的线程还没执行完毕，
        //这里的代码会暂停，等待线程执行完毕
        String s = futureTask.get();
        System.out.println("callable线程返回的结果"+s);

        Callable<String> c1 = new MyCallableThread(300);
        FutureTask<String> f2 = new FutureTask<>(c1);
        new Thread(f2).start();
        String s2 = f2.get();
        System.out.println("callable2线程返回的结果"+s2);

        System.out.println();

    }

}
