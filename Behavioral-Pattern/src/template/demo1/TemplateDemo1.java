package template.demo1;

/**
 * @Classname TemplateDemo1
 * @Description TODO 模板模式
 * @Date 2020/3/22 19:30
 * @Author Danrbo
 */
public class TemplateDemo1 {
    public static void main(String[] args) {
        RedSoyMilk redSoyMilk = new RedSoyMilk();
        redSoyMilk.make();
        System.out.println("---------------------------------");
        PeanutMilk peanutMilk = new PeanutMilk();
        peanutMilk.make();
    }
}

/**
 * 豆奶抽象类
 */
abstract class SoyMilk {
    final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    void select() {
        System.out.println("第一步：选择好的新鲜黄豆");
    }

    abstract void addCondiments();

    void soak() {
        System.out.println("第三步：黄豆和配料开始浸泡，需要三个小时。");
    }

    void beat() {
        System.out.println("第四步：黄豆和配料放到搅拌机打碎。");
    }
}


/**
 * 红豆奶实现类
 */
class RedSoyMilk extends SoyMilk{
    @Override
    void addCondiments() {
        System.out.println("第二步：添加红豆。");
    }
}

/**
 * 花生豆奶实现类
 */
class PeanutMilk extends SoyMilk{
    @Override
    void addCondiments() {
        System.out.println("第三步：添加花生。");
    }
}


