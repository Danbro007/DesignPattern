package decorator.demo3;

/**
 * @Classname DecoratorDemo3
 * @Description TODO 只有一个装饰角色
 * @Date 2020/3/20 10:51
 * @Author Danrbo
 */
public class DecoratorDemo3 {

    public static void main(String[] args) {
        Jane jane = new Jane();
        Li li = new Li();
        DecoratorShirt shirtLi = new DecoratorShirt(li);
        shirtLi.wear();
        DecoratorShirt shirtJane = new DecoratorShirt(jane);
        shirtJane.wear();
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

class Li implements People {
    @Override
    public void wear() {
        System.out.println("Li 今天穿什么呢？");
    }
}


/**
 * 具体的装饰者类
 */
class DecoratorShirt implements People {

    private People people;

    public DecoratorShirt(People people) {
        this.people = people;
    }

    @Override
    public void wear() {
        people.wear();
        System.out.println("今天穿短袖");
    }
}
