package factory.abstractFactory;

/**
 * @Classname AbstractFactoryDemo
 * @Description TODO 抽象工厂
 * @Date 2020/3/18 13:36
 * @Author Danrbo
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Factory factory;
        Bullet bullet;
        Gun gun;
        //创建Ak工厂
        factory = new AkFactory();
        //通过AK工厂生产子弹和枪，然后调用他们的方法
        bullet = factory.produceBullet();
        bullet.load();
        gun = factory.produceGun();
        gun.shooting();
    }
}

/**
 * 枪接口
 */
interface Gun {
    void shooting();
}

/**
 * 子弹接口
 */
interface Bullet {
    void load();
}

/**
 * 工厂接口
 */
interface Factory {
    /**
     * 生产枪
     *
     * @return 枪对象
     */
    Gun produceGun();

    /**
     * 生产子弹
     *
     * @return 子弹对象
     */
    Bullet produceBullet();
}

/**
 * Ak工厂
 */
class AkFactory implements Factory {
    @Override
    public Gun produceGun() {
        return new Ak();
    }

    @Override
    public Bullet produceBullet() {
        return new AkBullet();
    }
}

/**
 * M4A1工厂
 */
class M4A1Factory implements Factory {
    @Override
    public Gun produceGun() {
        return new M4A1();
    }

    @Override
    public Bullet produceBullet() {
        return new M4A1Bullet();
    }
}

/**
 * Ak枪类
 */
class Ak implements Gun {

    @Override
    public void shooting() {
        System.out.println("shooting with AK");
    }
}

/**
 * M4A1枪类
 */
class M4A1 implements Gun {

    @Override
    public void shooting() {
        System.out.println("shooting with M4A1");
    }
}

/**
 * AK子弹类
 */
class AkBullet implements Bullet {

    @Override
    public void load() {
        System.out.println("Load bullets with AK");
    }
}

/**
 * M4A1子弹类
 */
class M4A1Bullet implements Bullet {

    @Override
    public void load() {
        System.out.println("Load bullets with M4A1");
    }

}
