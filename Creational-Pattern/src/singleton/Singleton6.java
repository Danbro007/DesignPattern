package singleton;

/**
 * @Classname Singleton6
 * @Description TODO 单例模式之懒汉式枚举方式
 * @Date 2020/3/18 12:22
 * @Author Danrbo
 */
public enum Singleton6 {
    INSTANCE;

    public void doingSomething() {
        System.out.println("枚举方法实现单例");
    }

    public static void main(String[] args) {
        Singleton6 instance1 = Singleton6.INSTANCE;
        Singleton6 instance2 = Singleton6.INSTANCE;
        System.out.println("isSingleton:" + (instance1 == instance2));//true

    }

}
