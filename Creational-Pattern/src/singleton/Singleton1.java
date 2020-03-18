package singleton;

/**
 * @Classname Singleton1
 * @Description TODO 单例模式之饿汉模式
 * @Date 2020/3/18 11:18
 * @Author Danrbo
 */

/**
 * 1、静态实例在类被加载的时候创建，保证线程安全
 * 2、构造器被私有化，用户无法通过构造器创建对象
 */
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println("isSingleton:" + (instance1 == instance2));//true
    }
}
