package adaptor;

/**
 * @Classname AdaptorDemo
 * @Description TODO 适配器模式
 * @Date 2020/3/19 11:26
 * @Author Danrbo
 */
public class AdaptorDemo {
    public static void main(String[] args) {
        Target target = new M5DataLine();
        target.connection();
        Target adapter = new M5DataLineAdapter();
        adapter.connection();
        System.out.println();
        //开始适配
        M5DataLineAdapter2 adapter2 = new M5DataLineAdapter2(new M5DataLine());
        adapter2.connection();
    }
}

/**
 * 数据线类
 */
class M4DataLine {
    public void connection() {
        System.out.println("使用小米4数据线连接...");
    }
}

/**
 * 创建连接的接口
 */
interface Target {
    void connection();
}


class M5DataLine implements Target {

    @Override
    public void connection() {
        System.out.println("使用小米5数据线连接...");
    }
}

/**
 * M5转M4的适配器
 */
class M5DataLineAdapter extends M4DataLine implements Target {
    @Override
    public void connection() {
        System.out.println("插入 type-c 转接头");
        super.connection();
    }
}

/**
 * 调用的是继承Target对象的connection方法
 */
class M5DataLineAdapter2 implements Target {
    private Target target;

    public M5DataLineAdapter2(Target target) {
        this.target = target;
    }

    @Override
    public void connection() {
        System.out.println("插入 type-c 转接头");
        target.connection();
    }
}