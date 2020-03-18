package singleton;

import java.util.concurrent.*;

/**
 * @Classname Singleton5
 * @Description TODO 单例模式之懒汉式静态内部类
 * @Date 2020/3/18 12:11
 * @Author Danrbo
 */
public class Singleton5 {
    private Singleton5() {
    }

    private static class Inner {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return Inner.INSTANCE;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Singleton5> c = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        //创建线程池
        ExecutorService pool = Executors.newFixedThreadPool(2);
        Future<Singleton5> future1 = pool.submit(c);
        Future<Singleton5> future2 = pool.submit(c);
        System.out.println("isSingleton:" + (future1.get() == future2.get()));//true
    }
}
