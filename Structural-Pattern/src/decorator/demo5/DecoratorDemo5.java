package decorator.demo5;

/**
 * @Classname DecoratorDemo5
 * @Description TODO 半透明装饰者
 * @Date 2020/3/20 11:03
 * @Author Danrbo
 */
public class DecoratorDemo5 {
    public static void main(String[] args) {
        // 尽量不要这样声明
        DecoratorSuit decoratorSuit = new DecoratorSuit(new DecoratorShirt(new Jane()));
        decoratorSuit.wear();
        decoratorSuit.eat();
        System.out.println("----------------------------------------");
        /*----------------------------------------------------------*/
        // 要这样声明
        People p = new DecoratorSuit(new DecoratorShirt(new Jane()));
        p.wear();
//        p.eat();//error
        System.out.println("----------------------------------------");
        /*----------------------------------------------------------*/
        People p2 = new DecoratorSuit(new DecoratorShirt(new Jane()));
        ((DecoratorSuit) p2).eat();
    }
}

/**
 * People接口
 * 有wear行为
 */
interface People {
    void wear();
}

/**
 * 具体的对象，该对象将被附加一些额外的操作
 */
class Jane implements People {
    @Override
    public void wear() {
        System.out.println("Jane 今天穿什么呢？");
    }
}

/**
 * 装饰者类，持有一个被装饰的对象。
 * 自己有定义了一个eat的抽象方法
 */
abstract class Decorator implements People {
    private People people;

    public Decorator(People people) {
        this.people = people;
    }

    abstract public void eat();

    @Override
    public void wear() {
        people.wear();
    }
}

/**
 * 具体的装饰者类
 */
class DecoratorShirt extends Decorator {
    public DecoratorShirt(People people) {
        super(people);
    }

    @Override
    public void eat() {
        System.out.println("穿了短袖--吃饭");
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿短袖");
    }
}

class DecoratorSuit extends Decorator {
    public DecoratorSuit(People people) {
        super(people);
    }

    @Override
    public void eat() {
        System.out.println("穿了西服--吃饭");
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿西服");
    }
}

