package template.demo2;

/**
 * @Classname TemplateDemo2
 * @Description TODO 模板模式的钩子方法
 * @Date 2020/3/22 19:43
 * @Author Danrbo
 */
public class TemplateDemo2 {
    public static void main(String[] args) {
        PureSoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }
}

/**
 * 豆奶抽象类
 */
abstract class SoyMilk {
    final void make() {
        select();
        if (isAddCondiments()) {
            addCondiments();
        }
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

    /**
     * 钩子方法 子类可是视情况是否覆盖该方法
     * 是否添加材料，默认为是
     * @return true：添加材料    false:不添加
     */
    boolean isAddCondiments() {
        return true;
    }
}


/**
 * 红豆奶实现类
 */
class RedSoyMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("第二步：添加红豆。");
    }
}

/**
 * 花生豆奶实现类
 */
class PeanutMilk extends SoyMilk {
    @Override
    void addCondiments() {
        System.out.println("第三步：添加花生。");
    }
}

/**
 * 纯豆奶，不添加额外材料。
 * 抽象类SoyMilk默认的isAddCondiments是true
 * 由于我们是要不添加材料，所以我们这里重写覆盖isAddCondiments方法
 * 返回false.
 */
class PureSoyMilk extends SoyMilk{
    @Override
    void addCondiments() {
        
    }

    @Override
    boolean isAddCondiments() {
        return false;
    }
}