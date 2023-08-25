package 多线程.D8_thread_pool;

import java.util.concurrent.*;

/**
 * 目标：掌握线程池的创建
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //1.通过ThreadPoolExecutor创建线程池对象
        //    public ThreadPoolExecutor(int corePoolSize,
        //          int maximumPoolSize,
        //  long keepAliveTime,
        //TimeUnit unit,
        //BlockingQueue<Runnable> workQueue,
        //ThreadFactory threadFactory,
        //RejectedExecutionHandler handler)
       ExecutorService pool =  new ThreadPoolExecutor(3,5,
                8,TimeUnit.SECONDS,
                //new LinkedBlockingQueue<>(4),
               new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.CallerRunsPolicy()
        );
        MyRunnable runnable = new MyRunnable();
        pool.execute(runnable);//线程池会自动创建一个新线程，自动处理这个任务，自动执行的1
        pool.execute(runnable);//线程池会自动创建一个新线程，自动处理这个任务，自动执行的2
        pool.execute(runnable);//线程池会自动创建一个新线程，自动处理这个任务，自动执行的3
        pool.execute(runnable);//线程池会自动创建一个新线程，自动处理这个任务，自动执行的4
        pool.execute(runnable);//线程池会自动创建一个新线程，自动处理这个任务，自动执行的5
        pool.execute(runnable);//复用前面的核心线程6
        pool.execute(runnable);//复用前面的核心线程7
        //三个核心线程在忙、任务队列满了4个，就会创建临时线程
        pool.execute(runnable);//复用前面的核心线程8
        pool.execute(runnable);//复用前面的核心线程9
        //都满了，就会到了新任务拒绝时机
        pool.execute(runnable);//复用前面的核心线程10
        pool.execute(runnable);//复用前面的核心线程10
        pool.execute(runnable);//复用前面的核心线程10



        //pool.shutdown();//等待任务执行完毕后再关闭线程池
        //pool.shutdownNow();//不管任务是否执行完毕，立即关闭线程池
    }
}
