package visitor.dmeo1;

/**
 * @Classname Happy
 * @Description TODO
 * @Date 2020/3/23 15:21
 * @Author Danrbo
 */
public class Happy extends Action {
    @Override
    void act(Man man) {
        System.out.println("男的开心状态");
    }

    @Override
    void act(Woman woman) {
        System.out.println("女的开心状态");
    }
}
