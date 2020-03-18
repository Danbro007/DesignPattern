package singleton;

/**
 * @Classname Singleton2
 * @Description TODO 单例模式之懒汉式非线程安全版
 * @Date 2020/3/18 11:33
 * @Author Danrbo
 */

import java.util.concurrent.*;

/**
 * 1、调用getInstance方法时，先判断instance是否为空，如果为空则实例化对象
 * 2、由于没有加synchronized，线程不安全。
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() throws InterruptedException {
        if (instance == null) {
            //方便让其他线程进入此方法创建对象
            Thread.sleep(100);
            instance = new Singleton2();
        }
        return instance;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton2 instance1 = Singleton2.getInstance();
//        Singleton2 instance2 = Singleton2.getInstance();
//        System.out.println("isSingleton:" + (instance1 == instance2));//true
        Callable<Singleton2> c = new Callable<Singleton2>() {
            @Override
            public Singleton2 call() throws Exception {
                return Singleton2.getInstance();
            }
        };
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Singleton2> future1 = pool.submit(c);
        Future<Singleton2> future2 = pool.submit(c);
        System.out.println("isSingleton:" + (future1.get() == future2.get()));//false
    }
}
