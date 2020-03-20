package decorator.demo1;

/**
 * @Classname DecoratorDemo1
 * @Description TODO 装饰者模式
 * @Date 2020/3/20 10:00
 * @Author Danrbo
 */
public class DecoratorDemo1 {
    public static void main(String[] args) {
        Jane jane = new Jane();
        DecoratorPants pants = new DecoratorPants(jane);
        pants.wear();
        System.out.println("------------------------");
        DecoratorShirt shirt = new DecoratorShirt(jane);
        shirt.wear();
        System.out.println("------------------------");
        DecoratorSuit suit = new DecoratorSuit(jane);
        suit.wear();
        System.out.println("------------------------");
        DecoratorShoes shoes = new DecoratorShoes(jane);
        shoes.wear();
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
 */
class Decorator implements People {
    private People people;

    public Decorator(People people) {
        this.people = people;
    }

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
    public void wear() {
        super.wear();
        System.out.println("今天穿西服");
    }
}

class DecoratorPants extends Decorator {
    public DecoratorPants(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿裤子");
    }
}

class DecoratorShoes extends Decorator {
    public DecoratorShoes(People people) {
        super(people);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿鞋");
    }
}