package singleton;

import java.util.concurrent.*;

/**
 * @Classname Singleton3
 * @Description TODO 单例模式之懒汉式线程安全版
 * @Date 2020/3/18 11:48
 * @Author Danrbo
 */

/**
 * 1、在getInstance方法上加上锁了，同一时刻只能有一个线程对Singleton3操作
 */
public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() throws InterruptedException {
        if (instance == null) {
            //方便让其他线程进入此方法创建对象
            Thread.sleep(100);
            instance = new Singleton3();
        }
        return instance;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton3 instance1 = Singleton3.getInstance();
//        Singleton3 instance2 = Singleton3.getInstance();
//        System.out.println("isSingleton:" + (instance1 == instance2));//true
        Callable<Singleton3> c = new Callable<Singleton3>() {
            @Override
            public Singleton3 call() throws Exception {
                return Singleton3.getInstance();
            }
        };
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Singleton3> future1 = pool.submit(c);
        Future<Singleton3> future2 = pool.submit(c);
        System.out.println("isSingleton:" + (future1.get() == future2.get()));//true
    }
}
