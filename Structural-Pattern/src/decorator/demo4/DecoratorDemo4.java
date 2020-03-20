package decorator.demo4;

/**
 * @Classname DecoratorDemo4
 * @Description TODO 具体构建角色和具体装饰角色都只有一个
 * @Date 2020/3/20 10:58
 * @Author Danrbo
 */
public class DecoratorDemo4 {
    public static void main(String[] args) {
        Jane jane = new Jane();
        DecoratorShirt shirt = new DecoratorShirt(jane);
        shirt.wear();
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
 * 具体的装饰者类
 */
class DecoratorShirt extends Jane {

    private Jane jane;

    public DecoratorShirt(Jane jane) {
        this.jane = jane;
    }

    @Override
    public void wear() {
        jane.wear();
        System.out.println("今天穿短袖");
    }
}