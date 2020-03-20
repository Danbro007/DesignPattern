package flyWeight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname FlyWeightDemo1
 * @Description TODO 享元模式
 * @Date 2020/3/20 15:21
 * @Author Danrbo
 */
public class FlyWeightDemo1 {
    public static void main(String[] args) {
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        FlyWeight firstOne = flyWeightFactory.getFlyWeight("firstOne");
        FlyWeight secondOne = flyWeightFactory.getFlyWeight("secondOne");
        FlyWeight firstOne1 = flyWeightFactory.getFlyWeight("firstOne");
        System.out.println("----------state------------");
        firstOne.action("firstOneState");
        firstOne1.action("firstOne1State");
        secondOne.action("secondOne");
        System.out.println("----------res--------------");
        System.out.println("res with firstOne and secondOne = " + (firstOne == secondOne));
        System.out.println("res with firstOne1 and secondOne = " + (firstOne1 == secondOne));
        System.out.println("res with firstOne1 and firstOne = " + (firstOne1 == firstOne));
    }
}

/**
 * 享元接口，定义共享的接口
 */
interface FlyWeight {
    void action(String externalState);
}

/**
 * 具体享元类，实现享元接口。该类的对象将被复用。
 */
class ConcreteFlyWeight implements FlyWeight {
    private String name;

    public ConcreteFlyWeight(String name) {
        this.name = name;
    }

    @Override
    public void action(String externalState) {
        System.out.println(this.name + "----->" + externalState);
    }
}


class FlyWeightFactory {
    private static final ConcurrentHashMap<String, FlyWeight> FLY_WEIGHT_MAP = new ConcurrentHashMap<>();

    public FlyWeightFactory() {
    }

    public FlyWeight getFlyWeight(String name) {
        if (FLY_WEIGHT_MAP.get(name) == null) {
            synchronized (FLY_WEIGHT_MAP) {
                if (FLY_WEIGHT_MAP.get(name) == null) {
                    System.out.printf("Instance of name = {%s} does not exist, creating it\n", name);
                    FLY_WEIGHT_MAP.put(name, new ConcreteFlyWeight(name));
                    System.out.printf("Instance of name = {%s} has created\n", name);
                }
            }
        }
        return FLY_WEIGHT_MAP.get(name);
    }
}
