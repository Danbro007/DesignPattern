package bridge;

/**
 * @Classname BridgeDemo2
 * @Description TODO 桥接模式
 * @Date 2020/3/19 13:30
 * @Author Danrbo
 */
public class BridgeDemo2 {

    public static void main(String[] args) {
        FoldedPhone2 xiaomiFoldedPhone = new FoldedPhone2(new Xiaomi());
        xiaomiFoldedPhone.call();
        UpRightPhone2 huaWeiUpRightPhone2 = new UpRightPhone2(new Huawei());
        huaWeiUpRightPhone2.call();
    }
}

/**
 * 品牌接口 只有call方法
 */
interface Brand {
    void call();
}

/**
 * 具体品牌的实现
 * 实现call方法
 */
class Vivo implements Brand {

    @Override
    public void call() {
        System.out.println("Vivo");
    }
}

class Huawei implements Brand {

    @Override
    public void call() {
        System.out.println("Huawei");
    }
}

class Xiaomi implements Brand {
    @Override
    public void call() {
        System.out.println("Xiaomi");
    }
}

/**
 * 电话抽象类
 * 构造器需要品牌对象
 * call调用的是继承品牌接口的对象的call方法
 */
abstract class Phone2{
    private Brand brand;

    public Phone2(Brand brand) {
        this.brand = brand;
    }
    protected void call(){
        this.brand.call();
    }
}

/**
 * 各种类型的电话
 */
class FoldedPhone2 extends Phone2{

    public FoldedPhone2(Brand brand) {
        super(brand);
    }
    @Override
    public void call(){
        super.call();
    }
}

class SlidePhone2 extends Phone2{

    public SlidePhone2(Brand brand) {
        super(brand);
    }
    @Override
    public void call(){
        super.call();
    }
}

class UpRightPhone2 extends Phone2{

    public UpRightPhone2(Brand brand) {
        super(brand);
    }
    @Override
    public void call(){
        super.call();
    }
}