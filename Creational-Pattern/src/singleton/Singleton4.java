package singleton;

/**
 * @Classname Singleton4
 * @Description TODO 单例模式之懒汉式双重检查加锁版本
 * @Date 2020/3/18 11:54
 * @Author Danrbo
 */

import java.util.concurrent.*;

/**
 * 1、在静态变量instance添加了volatile，让这个静态变量保证了在多线程的可见性
 * 2、getInstance方法里先判断instance是否为空，如果为空再锁Singleton4这个类,
 *    减小了每次调用getInstance时都上锁所消耗的时间，而且只需要同步一次
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Singleton4> future1 = pool.submit(c);
        Future<Singleton4> future2 = pool.submit(c);
        System.out.println("isSingleton:" + (future1.get() == future2.get()));//true
    }

}
