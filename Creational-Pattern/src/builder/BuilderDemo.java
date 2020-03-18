package builder;

/**
 * @Classname BuilderDemo
 * @Description TODO 建造者模式
 * @Date 2020/3/18 14:11
 * @Author Danrbo
 */
public class BuilderDemo {
    public static void main(String[] args) {
        //创建建造者
        ConcreteBuilder builder = new ConcreteBuilder();
        //创建指挥者，把建造者放入指挥者的构造器里
        Director director = new Director(builder);
        //调用指挥者的construct()生产出产品product
        Product product = director.construct();
        System.out.println(product);//Product{partA='建造partA', partB='建造partB', partC='建造partC'}
    }
}

/**
 * 产品类
 */
class Product {
    private String partA;
    private String partB;
    private String partC;

    @Override
    public String toString() {
        return "Product{" +
                "partA='" + partA + '\'' +
                ", partB='" + partB + '\'' +
                ", partC='" + partC + '\'' +
                '}';
    }

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}

/**
 * 建造者的抽象类
 */
abstract class AbstractBuilder {

    Product product = new Product();

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}

/**
 * 建造者的实现类
 */
class ConcreteBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("建造partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造partB");

    }

    @Override
    public void buildPartC() {
        product.setPartC("建造partC");

    }
}

/**
 * 指挥者类
 */
class Director {
    private AbstractBuilder builder;

    public Director(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    /**
     * 1、让建造者建造出产品
     * 2、实际上调用的是建造者的builderPartA()、builderPartB()和builderPartC()
     * 返回product对象
     *
     * @return 产品
     */
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
