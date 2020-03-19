package prototype;

import java.util.HashMap;

/**
 * @Classname PrototypeDemo
 * @Description TODO 原型模式
 * @Date 2020/3/18 15:37
 * @Author Danrbo
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen=new UnderlinePen('~');
        MessageBox mbox=new MessageBox('*');
        MessageBox sbox=new MessageBox('/');
        manager.register("Strong message", underlinePen);
        manager.register("Waring Box", mbox);
        manager.register("Slash Box", sbox);
        //从manager中的showCase获取对应的product的clone
        Product p1=manager.createClone("Strong message");
        p1.use("hello world");
        Product p2=manager.createClone("Waring Box");
        p2.use("hello world");
        Product p3=manager.createClone("Slash Box");
        p3.use("hello world");
    }


}

/**
 * 产品接口
 * 有两个接口：1、use 2、createClone
 */
interface Product extends Cloneable {
    /**
     * "使用"方法，具体实现交给子类
     *
     * @param s 要使用的字符串
     */
    public abstract void use(String s);

    /**
     * 用于复制实例
     *
     * @return 复制后的实例
     */
    public abstract Product createClone();
}

/**
 * 负责管理product
 * createClone调用的是继承product接口的类的实例对象
 */
class Manager {
    /**
     * 存储“名字”和“产品”之间的对应关系
     */
    private HashMap<String, Product> showCase = new HashMap<>(16);

    /**
     * 把“产品“ 和 ”名字“的对应关系存储在showCase，可以理解为存储在缓存里。
     *
     * @param name    产品名
     * @param product 产品接口
     */
    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    /**
     * 通过名称从showCase中获取返回该产品的clone
     *
     * @param name 产品名
     * @return 产品的clone
     */
    public Product createClone(String name) {
        Product product = showCase.get(name);
        return product.createClone();
    }
}

/**
 * 装饰方框样式的具体原型，实现了Product接口，
 * 实现复制现有实例并生成新实例的方法。
 */

class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " " + decochar);
        for (int i = 0; i < length + 4; i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }

    /**
     * 返回自己的clone
     * @return 实例的clone
     */
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

/**
 *下划线样式的具体原型，实现了Product接口，用于实现复制现有实例并生成新实例的方法。
 * UnderlinePen类的实现几乎和MessageBox类一样，不同的可能只是use方法的实现。
 */
class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        //打印出你  "输入文字"
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length + 2; i++) {
            System.out.print(ulchar);

        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
