package decorator.demo2;


/**
 * @Classname DecoratorDemo2
 * @Description TODO 只有一个具体构件角色
 * @Date 2020/3/20 10:46
 * @Author Danrbo
 */
public class DecoratorDemo2 {
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
 * 具体的对象，该对象将被附加一些额外的操作
 */
class Jane {
    public void wear() {
        System.out.println("Jane 今天穿什么呢？");
    }
}

/**
 * 装饰者类，持有一个被装饰的对象。
 */
class Decorator extends Jane {
    private Jane jane;

    public Decorator(Jane jane) {
        this.jane = jane;
    }

    @Override
    public void wear() {
        jane.wear();
    }
}

/**
 * 具体的装饰者类
 */
class DecoratorShirt extends Decorator {
    public DecoratorShirt(Jane jane) {
        super(jane);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿短袖");
    }
}

class DecoratorSuit extends Decorator {
    public DecoratorSuit(Jane jane) {
        super(jane);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿西服");
    }
}

class DecoratorPants extends Decorator {
    public DecoratorPants(Jane jane) {
        super(jane);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿裤子");
    }
}

class DecoratorShoes extends Decorator {
    public DecoratorShoes(Jane jane) {
        super(jane);
    }

    @Override
    public void wear() {
        super.wear();
        System.out.println("今天穿鞋");
    }
}